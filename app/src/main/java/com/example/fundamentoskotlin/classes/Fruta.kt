package com.example.fundamentoskotlin.classes

open class Fruta(var nombre:String, var color: String, var amargo:Boolean) {

    open fun imprimirFruta(){
        println("Nombre de la fruta: $nombre")
        println("Color: $color")
        println("Es amargo: $amargo")
    }
}