package com.genfare.broadc

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class MyReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context?, p1: Intent?) {
        context?.startActivity(Intent(context,SecondActivity::class.java))
    }

}