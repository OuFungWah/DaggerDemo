package com.crazywah.daggerdemo

import android.util.Log
import javax.inject.Inject

class HelloWorldCommand @Inject constructor(val outputter: Outputter) : Command {

    companion object {
        private const val TAG = "HelloWorldCommand"
    }

    override fun key(): String = "hello"

    override fun handleInput(input: List<String>): Command.Status {
        if (input.isNotEmpty()) return Command.Status.INVALID
//        Log.d(TAG, "World")
        outputter.output("world")
        return Command.Status.HANDLED
    }

}