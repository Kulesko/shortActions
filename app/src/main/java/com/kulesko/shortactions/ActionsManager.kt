package com.kulesko.shortactions

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ActionsManager : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (intent.action == "com.kulesko.shortactions.dosomething") sendBroadcast()
    }

    private fun sendBroadcast() {
        Intent().also { intent ->
            intent.setAction("com.nutomic.syncthingandroid.action.STOP")
            intent.setPackage("com.nutomic.syncthingandroid")
            sendBroadcast(intent)
        }
    }

}