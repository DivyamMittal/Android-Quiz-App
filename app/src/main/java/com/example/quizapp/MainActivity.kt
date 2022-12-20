package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnStart : Button = findViewById(R.id.btn_Start)
        var nameText : EditText = findViewById(R.id.nameText)

        btnStart.setOnClickListener {
            if(nameText.text.isEmpty())
            {
                Toast.makeText(this,"Enter Name",Toast.LENGTH_LONG).show()
            }
            else{
                var Intent = Intent(this,QuizQuestionsActivity::class.java)
                Intent.putExtra(Constants.USER_NAME, nameText.text.toString())
                startActivity(Intent)
            }
        }
    }
}