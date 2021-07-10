package com.hllbr.oopencapsulationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var james = Musicians("JAMES","Guitar",55)
        //james.age = 60 Encapsulation işleminden sonra değiştirme işlemim bloke oldu fakat veriyi okuma işlemim aktif olarak çalışıyor
        println(james.age.toString())



        println(james.returnBandName("hllbr85"))

        println(james.returnBandName("brbr58")
        )
    }
}