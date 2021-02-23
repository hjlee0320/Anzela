package com.example.anzela

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstInit()
    }

    fun firstInit() {
        btn_menu.setOnClickListener(this)
        btn_noti.setOnClickListener(this)
        btn_myInfo.setOnClickListener(this)
        my_location.setOnClickListener(this)
        btn_ridingList.setOnClickListener(this)

        tv_uInfo.setText(resources.getText(R.string.u_info, "do"))


    }


    override fun onClick(p0: View?) {

    }
}