package com.example.task_form

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //вывод элемента EditText для ввода желаемой зарплаты
        val radioGroup = findViewById<RadioGroup>(R.id.list_work)
        val salary_editText = findViewById<EditText>(R.id.txtBox_salary)
        val salary_textView = findViewById<TextView>(R.id.lbl_salary)

        radioGroup.setOnCheckedChangeListener { radioGroup, checked_id ->
            if (checked_id == R.id.with_salary) {
                salary_editText.visibility = View.VISIBLE
                salary_textView.visibility = View.VISIBLE
            }
            else {
                salary_editText.visibility = View.INVISIBLE
                salary_textView.visibility = View.INVISIBLE
            }
        }
    }
}