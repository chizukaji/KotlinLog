package jp.techacademy.chizu.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("ポチ", 3)
        val human2 = Human("ポチ", 3)

        human1.say()
        human2.think()
    }
}
