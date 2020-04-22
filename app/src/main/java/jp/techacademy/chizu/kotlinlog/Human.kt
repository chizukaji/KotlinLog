package jp.techacademy.chizu.kotlinlog

import android.util.Log

class Human: Animal, Thinkable {

    var hobby: String = "人生"

    constructor(name: String, age: Int): super(name, age){
    }

    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }

    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }

}

