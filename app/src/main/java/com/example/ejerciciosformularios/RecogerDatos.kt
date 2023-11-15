package com.example.ejerciciosformularios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RecogerDatos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recoger_datos)


        var tv_nombre=findViewById<TextView>(R.id.tv_nombre)
        var tv_edad=findViewById<TextView>(R.id.tv_edad)
        var nom_recogido=intent.getStringExtra("nombre")
        var num_recogido=intent.getIntExtra("numero",0)

        tv_nombre.text=nom_recogido.toString()
        tv_edad.text=num_recogido.toString()


    }
}