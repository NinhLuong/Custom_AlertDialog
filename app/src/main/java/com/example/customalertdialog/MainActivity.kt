package com.example.customalertdialog

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_dialog.*

class MainActivity : AppCompatActivity() {
    lateinit var dialog: AlertDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnClick.setOnClickListener {
            showDialog()
        }
    }

    private fun showDialog() {
        val build = AlertDialog.Builder(this)
        val view = layoutInflater.inflate(R.layout.custom_dialog, null)
        build.setView(view)
        val btnClose = view.findViewById<ImageButton>(R.id.btnClose)
        btnClose.setOnClickListener{
            dialog.dismiss()
        }

        dialog = build.create()
        dialog.show()
    }
}