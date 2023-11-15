package com.example.ejerciciosformularios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent=Intent(this,RecogerDatos::class.java)

        var boton_validar=findViewById<Button>(R.id.bt_insertar)
        var et_nom=findViewById<EditText>(R.id.textInputEditTextNombre)
        var et_edad=findViewById<EditText>(R.id.textInputEditTextEdad)

        var text_input_layout_nom=findViewById<TextInputLayout>(R.id.textInputLayoutNombre)
        var text_input_layout_edad=findViewById<TextInputLayout>(R.id.textInputLayoutEdad)






         fun validateForm():Boolean{
            var validar=true

            val nombre=et_nom.text.toString().trim()
            val edad=et_edad.text.toString().trim()
             intent.putExtra("nombre",nombre)
             intent.putExtra("edad",edad)

            if(nombre.isEmpty()){
                text_input_layout_nom.error="Introduce tu nombre"
                validar=false
            }else{
                text_input_layout_nom.error=null
            }

            if(nombre.length<2){
                text_input_layout_nom.error="El nombre debe contener mas de 2 caracteres"
                validar=false
            }else{
                text_input_layout_nom=null
            }

            if(edad.isEmpty()){
                text_input_layout_edad.error="Introduce tu edad"
                validar=false
            }else{
                text_input_layout_edad.error=null
            }

            if(edad.toInt()<18){
                text_input_layout_edad.error="No eres mayor de 18 años"
                validar=false
            }else{
                text_input_layout_edad.error=null
            }

            return validar

        }
        boton_validar.setOnClickListener(){
            if(validateForm()){
                startActivity(intent)
            }
        }

    }


}