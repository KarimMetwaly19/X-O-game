package com.example.x_o

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val title=findViewById<TextView>(R.id.textView)
        val b1=findViewById<Button>(R.id.button1)
        val b2=findViewById<Button>(R.id.button2)
        val b3=findViewById<Button>(R.id.button3)
        val b4=findViewById<Button>(R.id.button4)
        val b5=findViewById<Button>(R.id.button5)
        val b6=findViewById<Button>(R.id.button6)
        val b7=findViewById<Button>(R.id.button7)
        val b8=findViewById<Button>(R.id.button8)
        val b9=findViewById<Button>(R.id.button9)
        var cnt=0
        var endgame=false
        var xw=false
        var ow=false
        fun gamecheck(){//Rows
            if (b1.text==b2.text&&b2.text==b3.text){
                if(b3.text=="X"){
                title.text="Player 1 Wins!"}
                else {title.text="Player 2 Wins"}

            }
             else if (b4.text==b5.text&&b5.text==b6.text){
                if(b6.text=="X"){
                    title.text="Player 1 Wins!"
                    Toast.makeText(this, "Woon", Toast.LENGTH_SHORT).show()}
                else {title.text="Player 2 Wins"}
            }
            else if (b7.text==b8.text&&b8.text==b9.text){
                if(b9.text=="X"){
                    title.text="Player 1 Wins!"
                   }
                else {title.text="Player 2 Wins"}
            }
//Columns
           else if (b1.text==b4.text&&b4.text==b7.text){
                if(b7.text=="X"){
                    title.text="Player 1 Wins!"}
                else {title.text="Player 2 Wins"}
            }
            else if (b2.text==b5.text&&b5==b8.text){
                if(b8.text=="X"){
                    title.text="Player 1 Wins!"}
                else {title.text="Player 2 Wins"}
            }
            else if (b3.text==b6.text&&b6.text==b9.text){
                if(b9.text=="X"){
                    title.text="Player 1 Wins!"}
                else {title.text="Player 2 Wins"}
            }
            //Diagonals
            else if (b1.text==b5.text&&b5.text==b9.text){
                if(b9.text=="X"){
                    title.text="Player 1 Wins!"}
                else {title.text="Player 2 Wins"}
            }
            else if(b3.text==b5.text&&b5.text==b7.text){
                if(b7.text=="X"){
                    title.text="Player 1 Wins!"}
                else {title.text="Player 2 Wins"}
            }
        }
//while(cnt<9)
            b1.setOnClickListener {

                if (cnt % 2 == 0) {
                    b1.text = "X"
                } else {
                    b1.text = "O"
                }
                cnt++
                gamecheck()
            }
            b2.setOnClickListener {
                if (cnt % 2 == 0) {
                    b2.text = "X"
                } else {
                    b2.text = "O"
                }
                cnt++
                gamecheck()
            }
            b3.setOnClickListener {
                if (cnt % 2 == 0) {
                    b3.text = "X"
                } else {
                    b3.text = "O"
                }
                cnt++
                gamecheck()
            }
        b4.setOnClickListener {
            if (cnt % 2 == 0) {
                b4.text = "X"
            } else {
                b4.text = "O"
            }
            cnt++
            gamecheck()
        }
        b5.setOnClickListener {
            if (cnt % 2 == 0) {
                b5.text = "X"
            } else {
                b5.text = "O"
            }
            cnt++
            gamecheck()
        }
        b6.setOnClickListener {
            if (cnt % 2 == 0) {
                b6.text = "X"
            } else {
                b6.text = "O"
            }
            cnt++
            gamecheck()
        }
        b7.setOnClickListener {
            if (cnt % 2 == 0) {
                b7.text = "X"
            } else {
                b7.text = "O"
            }
            cnt++
            gamecheck()
        }
        b8.setOnClickListener {
            if (cnt % 2 == 0) {
                b8.text = "X"
            } else {
                b8.text = "O"
            }
            cnt++
            gamecheck()}
        b9.setOnClickListener {
            if (cnt % 2 == 0) {
                b9.text = "X"
            } else {
                b9.text = "O"
            }
            cnt++
            gamecheck()}

    }

}

