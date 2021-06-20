package com.example.fundamentoskotlin

import com.example.fundamentoskotlin.classes.Manzana

fun main(){
    newTopic("Cantidad Frutas")
    ponerCantidad(fruta = "Manzanas", cant = 5)

    newTopic("Clase personalizada")
    var manzana = Manzana(nombre = "Manzana", color = "Verde", amargo = false, tam = "mediano")
    manzana.imprimirFruta()
}

private fun ponerCantidad(fruta:String, cant:Int){
    println("Tengo $cant $fruta")
}