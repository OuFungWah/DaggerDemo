package com.crazywah.daggerdemo

import android.util.Log
import javax.inject.Inject

class HelloWorldCommand : Command {

    companion object {
        private const val TAG = "HelloWorldCommand"
    }

    @Inject
    constructor()

    override fun key(): String = "hello"

    override fun handleInput(input: List<String>): Command.Status {
        if (input.isNotEmpty()) return Command.Status.INVALID
        Log.d(TAG, "World")
        return Command.Status.HANDLED
    }

}