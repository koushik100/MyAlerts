package com.koushik.myalertlibrary

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import kotlinx.android.synthetic.main.simple_alert.*

class SimpleAlert(val mContext: Context, val msg: String) : Dialog(mContext) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simple_alert)
        TXTmsg.text = msg
        BTN_OK.setOnClickListener { dismiss() }
    }
}