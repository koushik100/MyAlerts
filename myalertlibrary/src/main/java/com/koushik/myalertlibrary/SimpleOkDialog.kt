package com.koushik.myalertlibrary

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import kotlinx.android.synthetic.main.simple_alert.*
import kotlinx.android.synthetic.main.simple_yes_no_alert.TXTmsg

class SimpleOkDialog(
    val mContext: Context,
    val msg: String,
    val onlistner: OnListner
) :
    Dialog(mContext) {

    interface OnListner {
        fun OnCliked()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simple_alert)
        TXTmsg.text = msg
        BTN_OK.setOnClickListener {
            dismiss()
            onlistner.OnCliked()
        }
    }
}