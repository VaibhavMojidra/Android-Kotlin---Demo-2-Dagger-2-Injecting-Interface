package com.vaibhavmojidra.androidkotlindemo2daggerinterfaceinjection

import dagger.Binds
import dagger.Module

@Module
abstract class SmartPhoneModule {

    @Binds
    abstract fun bindsSmartPhone(iphone: Iphone):SmartPhone
}