package com.kulesko.shortactions

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class ActionsManager : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (intent.action == "com.kulesko.shortactions.dosomething") doSomething()
    }

    private fun doSomething() {
        Log.println(Log.ERROR, null, "did something but no idea what")
    }

}