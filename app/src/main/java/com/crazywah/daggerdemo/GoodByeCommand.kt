package com.crazywah.daggerdemo

import android.util.Log
import javax.inject.Inject

class GoodByeCommand @Inject constructor() : Command {

    companion object {
        private const val TAG = "GoodByeCommand"
    }

    override fun key(): String = "goodbye"

    override fun handleInput(input: List<String>): Command.Status {
        if (input.isNotEmpty()) return Command.Status.INVALID
        Log.d(TAG, "GoodBye!!!")
        return Command.Status.HANDLED
    }

}