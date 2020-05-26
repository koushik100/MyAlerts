package com.koushik.myalertlibrary

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import kotlinx.android.synthetic.main.simple_yes_no_alert.*

class SimpleyesnoDialog(
    val mContext: Context,
    val msg: String,
    val onlistner: OnListner
) :
    Dialog(mContext) {

    interface OnListner {
        fun OnClikedYes()
        fun OnClikedNo()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simple_yes_no_alert)
        TXTmsg.text = msg
        BTN_Yes.setOnClickListener {
            dismiss()
            onlistner.OnClikedYes()
        }
        BTN_No.setOnClickListener {
            dismiss()
            onlistner.OnClikedNo()
        }
    }
}