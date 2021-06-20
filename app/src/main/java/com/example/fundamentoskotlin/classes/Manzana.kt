package com.example.fundamentoskotlin.classes

class Manzana(nombre:String, color:String, amargo:Boolean, var tam:String) : Fruta(nombre, color, amargo) {

    override fun imprimirFruta() {
        println("Nombre: $nombre")
        println("Color: $color")
        println("Es amargo?: $amargo")
        println("Tamaño: $tam")
    }
}