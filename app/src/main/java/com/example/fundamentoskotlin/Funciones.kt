package com.example.fundamentoskotlin

import java.lang.Math.abs

fun main(){
    sayHello()
    newTopic("Argumentos")
    //println(sum(2,3))
    val a = 2
    val b = 3
    println("$a + $b = ${sum(a,b)}")
    println("$a - $b = ${sub(a,b)}")
    newTopic("Infix")
    val c = -3
    println(c.enableAbs(false))
    println("$a + $c = ${sum(a,c)}")
    println("$a + $c = ${sum(a,c.enableAbs(true))}")
    newTopic("Sobrecarga de funciones")
    showProduct(name = "Soda", promo = "10%")
    showProduct(name = "Pan")
    showProduct(name = "Caramelo", promo = "15%")
    showProduct(name = "Jugo", validity = "15 de marzo")
}

private fun sayHello():Unit { // Unit = void
    println("Hola Kotlin")
}

fun sum(a:Int, b:Int):Int{
    return a + b
}

fun sub(a:Int, b:Int) = a - b

//Se crea una extencion de una clase
infix fun Int.enableAbs(enable:Boolean) = if(enable) abs(this) else this

fun showProduct(name:String, promo:String = "Sin promoción", validity:String = "agotar existencia"){
    println("$name = $promo hasta $validity")
}