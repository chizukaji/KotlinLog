package jp.techacademy.chizu.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("タマ", 15, "人生")
        val human2 = Human("ポチ", 3, "哲学")

        human1.say()
        human1.think()

        human2.say()
        human2.think()
    }
}
