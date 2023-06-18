package com.vaibhavmojidra.androidkotlindemo2daggerinterfaceinjection

import android.util.Log
import javax.inject.Inject

class PlayGame @Inject constructor(val smartPhone: SmartPhone,val game: Game){
    init {
        smartPhone.isSmartPhoneAvailable()
        smartPhone.getSmartPhoneBrand()
        game.isGameDownloaded()
        Log.i("MyTag","PlayGame class initialized")
    }

    fun playGame(){
        Log.i("MyTag","Starting game")
    }

}