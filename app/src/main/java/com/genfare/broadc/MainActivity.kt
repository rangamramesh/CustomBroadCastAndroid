package com.genfare.broadc

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private var receiver: MyReceiver? = null
    private var intentFilter: IntentFilter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        receiver = MyReceiver()
        intentFilter = IntentFilter(getString(R.string.activityAction))
        button?.setOnClickListener {
            someMethod()
        }
    }

    override fun onResume() {
        super.onResume()
        registerReceiver(receiver, intentFilter)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(receiver)
    }

    private fun someMethod() {
        val intent = Intent(getString(R.string.activityAction))
        sendBroadcast(intent)
    }
}