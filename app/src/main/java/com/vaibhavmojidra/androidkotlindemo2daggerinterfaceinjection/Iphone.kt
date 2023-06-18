package com.vaibhavmojidra.androidkotlindemo2daggerinterfaceinjection

import android.util.Log
import javax.inject.Inject

class Iphone @Inject constructor() : SmartPhone  {
    override fun isSmartPhoneAvailable() {
        Log.i("MyTag","SmartPhone is available")
    }

    override fun getSmartPhoneBrand() {
        Log.i("MyTag","SmartPhone's brand is apple")
    }
}