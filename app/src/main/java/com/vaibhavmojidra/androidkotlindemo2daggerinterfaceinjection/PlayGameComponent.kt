package com.vaibhavmojidra.androidkotlindemo2daggerinterfaceinjection

import dagger.Component

@Component(modules = [SmartPhoneModule::class])
interface PlayGameComponent {
    fun getPlayGame():PlayGame
}