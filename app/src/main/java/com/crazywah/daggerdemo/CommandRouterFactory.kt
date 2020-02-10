package com.crazywah.daggerdemo

import dagger.Component

@Component(modules = [HelloWorldModule::class])
interface CommandRouterFactory {
    fun router(): CommandRouter
}