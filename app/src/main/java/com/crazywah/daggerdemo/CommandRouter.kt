package com.crazywah.daggerdemo

import android.util.Log
import javax.inject.Inject

final class CommandRouter @Inject constructor(command: Command) {

    companion object {
        private const val TAG = "CommandRouter"
    }

    private val commands: HashMap<String, Command> = hashMapOf()

    init {
        commands[command.key()] = command
    }

    /**
     * 分发
     */
    fun route(input: String): Command.Status {
        val splitInput: List<String> = input.split(" ")
        if (splitInput.isEmpty()) return invalidCommand(input)
        val commandKey = splitInput[0]
        val command: Command = commands[commandKey] ?: return invalidCommand(input)
        val status = command.handleInput(splitInput.subList(1, splitInput.size))
        if (status == Command.Status.INVALID) Log.e(TAG, "$commandKey: invalid arguments")
        return status
    }

    private fun invalidCommand(input: String): Command.Status {
        Log.e(TAG, String.format("couldn't understand \"%s\". please try again.", input))
        return Command.Status.INVALID
    }

}