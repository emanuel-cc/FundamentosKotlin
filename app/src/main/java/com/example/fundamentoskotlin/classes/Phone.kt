package com.example.fundamentoskotlin.classes

//Con open se le puede indicar que otras clases pueden heredar de este
open class Phone (protected val number:Int) {
    fun call(){
        println("Llamando...")
    }
    //Se habilita con open para poderse sobrescribir para otras clases
    open fun showNumber(){
        println("Mi número es: $number")
    }
}