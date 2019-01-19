package com.example.ratialania.firebaseauth

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_seocnd.*
import kotlinx.android.synthetic.main.activity_therdactivity.*

class Seocnd : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seocnd)

        Toast.makeText(this, "You have logged in succesfully",
            Toast.LENGTH_SHORT).show()

        Picasso.get().load("https://vignette.wikia.nocookie.net/animal-jam-clans-1/images/6/6c/12-sunrise-picture.jpg").into(imageView1);
        Picasso.get().load("https://i.stack.imgur.com/f9seR.jpg").into(imageView2);
        Picasso.get().load("https://twistedsifter.files.wordpress.com/2016/07/dulmen_bornste_waldweg.jpg").into(imageView3);
        Picasso.get().load("https://ichef.bbci.co.uk/news/976/cpsprodpb/27C9/production/_103158101_tha.jpg").into(imageView4);
        Picasso.get().load("https://c1.staticflickr.com/2/1520/24330829813_944c817720_b.jpg").into(imageView5);
        Picasso.get().load("https://cdn.pixabay.com/photo/2017/07/28/23/34/fantasy-picture-2550222_960_720.jpg").into(imageView6);
        Picasso.get().load("https://i.ytimg.com/vi/PyHk3R9cJnA/maxresdefault.jpg").into(imageView7);

    btnnext.setOnClickListener {
        val intent= Intent(this,therdactivity::class.java)
        startActivity(intent)
        Toast.makeText(this,"Write Something About Photos",Toast.LENGTH_SHORT).show()



    }

    }
}
