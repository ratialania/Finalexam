package com.example.ratialania.firebaseauth

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_therdactivity.*

class therdactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_therdactivity)

        init()
    }

    private fun init() {
        val database = FirebaseDatabase.getInstance()
        var myRef = database.getReference("")

        submitButton.setOnClickListener {
            // Write a message to the database
            myRef = database.getReference(idEditText.text.toString())
            myRef.setValue(messageEditText.text.toString())
            Toast.makeText(this,"Comment Added Successfully!", Toast.LENGTH_LONG).show()


        }

        }
    }

