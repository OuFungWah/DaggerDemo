package com.crazywah.daggerdemo

import dagger.Binds
import dagger.Module

@Module
abstract class HelloWorldModule {

    /**
     * This @Binds method tells Dagger that when something depends on a Command, Dagger should provide a HelloWorldCommand object in its place.
     * Notice that the return type of the method, Command, is the type that Dagger now knows how to provide, and the parameter type is the type that Dagger knows to use when something depends on Command.
     *
     * The method is abstract because just its declaration is enough to tell Dagger what to do. Dagger does not actually call this method or provide an implementation for it.
     */
    @Binds
    abstract fun helloWorldCommand(command: HelloWorldCommand): Command

}