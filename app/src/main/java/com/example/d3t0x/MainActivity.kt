package com.example.d3t0x

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.icu.text.CaseMap.Title
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
    lateinit var btnEasy : Button
    lateinit var btnMedium: Button
    lateinit var btnHard:Button
    lateinit var btnAccept1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnEasy = findViewById(R.id.btnEasy)
        btnMedium = findViewById(R.id.btnMedium)
        btnHard = findViewById(R.id.btnHard)
        btnEasy.setOnClickListener {
            showCustomDialog()
        }
        btnMedium.setOnClickListener {
            showCustomDialog2()
        }
        btnHard.setOnClickListener {
            showCustomDialog3()
        }








    }
    private fun showCustomDialog(){

        val dialog = Dialog(this)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dialogo)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        val btnCancel = dialog.findViewById<Button>(R.id.atras)
        val btnAccept = dialog.findViewById<Button>(R.id.aceptar)
        btnCancel.setOnClickListener {
            val mediaPlayer:MediaPlayer = MediaPlayer.create(this,R.raw.negative)
            mediaPlayer.start()
            dialog.dismiss()

        }
        btnAccept.setOnClickListener {
          startActivity(Intent(this,menu_principal::class.java))
            val mediaPlayer:MediaPlayer = MediaPlayer.create(this,R.raw.popcorn)
            mediaPlayer.start()
        }
       val mediaPlayer:MediaPlayer = MediaPlayer.create(this,R.raw.pop)
        mediaPlayer.start()
        dialog.show()


    }

    private fun showCustomDialog2(){

        val dialog = Dialog(this)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dialogo)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        val btnCancel = dialog.findViewById<Button>(R.id.atras)
        val Title = dialog.findViewById<TextView>(R.id.titleD)
        val desc1 = dialog.findViewById<TextView>(R.id.Desc1)
        val btnAccept = dialog.findViewById<Button>(R.id.aceptar)
        Title.setText(R.string.retoM)
        desc1.setText(R.string.dial2d1)
        btnCancel.setOnClickListener {
            val mediaPlayer:MediaPlayer = MediaPlayer.create(this,R.raw.negative)
            mediaPlayer.start()
            dialog.dismiss()
        }
        btnAccept.setOnClickListener {
            startActivity(Intent(this, menu_principal::class.java))
            val mediaPlayer: MediaPlayer = MediaPlayer.create(this, R.raw.popcorn)
            mediaPlayer.start()
        }
        val mediaPlayer:MediaPlayer = MediaPlayer.create(this,R.raw.pop)
        mediaPlayer.start()
        dialog.show()


    }
    private fun showCustomDialog3(){

        val dialog = Dialog(this)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dialogo)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        val btnCancel = dialog.findViewById<Button>(R.id.atras)
        val Title1 = dialog.findViewById<TextView>(R.id.titleD)
        val desc1 = dialog.findViewById<TextView>(R.id.Desc1)
        val desc2 = dialog.findViewById<TextView>(R.id.desc2)
        val desc3 = dialog.findViewById<TextView>(R.id.desc3)
        val btnAccept = dialog.findViewById<Button>(R.id.aceptar)

        Title1.setText(R.string.retoH)
        desc1.setText(R.string.dialog3_1)
        desc2.setText(R.string.dialog3_2)
        desc3.setText(R.string.dialog3_3)

        btnCancel.setOnClickListener {
            val mediaPlayer:MediaPlayer = MediaPlayer.create(this,R.raw.negative)
            mediaPlayer.start()
            dialog.dismiss()

        }
        btnAccept.setOnClickListener {
            startActivity(Intent(this, menu_principal::class.java))
            val mediaPlayer: MediaPlayer = MediaPlayer.create(this, R.raw.popcorn)
            mediaPlayer.start()
        }
        val mediaPlayer:MediaPlayer = MediaPlayer.create(this,R.raw.pop)
        mediaPlayer.start()
        dialog.show()


    }
}