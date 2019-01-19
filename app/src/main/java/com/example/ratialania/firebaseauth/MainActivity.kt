package com.example.ratialania.firebaseauth

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAuth = FirebaseAuth.getInstance()

        btnSignIn.setOnClickListener {
            mAuth.signInWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        val user = mAuth.currentUser
                        val intent = Intent(this,Seocnd::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, task.exception?.message,
                            Toast.LENGTH_SHORT).show()
                    }
                }
        }


        btnSignUp.setOnClickListener {
            mAuth.createUserWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        val user = mAuth.currentUser
                        Toast.makeText(this, "Account has been successfully created",
                            Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "Authentication failed.",
                            Toast.LENGTH_SHORT).show()
                    }

                }
        }
    }
}



