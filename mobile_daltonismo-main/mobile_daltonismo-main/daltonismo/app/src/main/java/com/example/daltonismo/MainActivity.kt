package com.example.daltonismo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.daltonismo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var ligacao: ActivityMainBinding
    var res = Resposta()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)
        ligacao = DataBindingUtil.setContentView(this, R.layout.activity_main)
        ligacao.resposta =  res
    }


}