package com.crazywah.daggerdemo

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class LogOutputModule {

    @Provides
    fun textOutputter(): Outputter = object : Outputter {
        override fun output(content: String) {
            Log.d("Log Outputter:", content)
        }
    }

}