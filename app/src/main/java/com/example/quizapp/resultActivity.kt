package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class resultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName : TextView = findViewById(R.id.tv_name)
        val tvScore : TextView = findViewById(R.id.tv_score)
        val btnGoToMain : Button = findViewById(R.id.btnGoToMain)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)
        var totalscore = intent.getIntExtra(Constants.correctAnswers,0)
        var totalQues = intent.getIntExtra(Constants.totalQuestions,0)
        tvScore.text = "Your Score is $totalscore/$totalQues"

        btnGoToMain.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}