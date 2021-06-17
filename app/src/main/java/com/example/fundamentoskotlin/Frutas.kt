package com.example.fundamentoskotlin

fun main(){
    newTopic("Cantidad Frutas")
    ponerCantidad(fruta = "Manzanas", cant = 5)
}

private fun ponerCantidad(fruta:String, cant:Int){
    println("Tengo $cant $fruta")
}