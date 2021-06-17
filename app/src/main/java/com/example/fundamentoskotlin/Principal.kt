package com.example.fundamentoskotlin

//Constante global, solo se debe declarar afuera de una función
const val separator = "=============="

fun main(){
    //print("Hola kotlin")
    newTopic("Hola Kotlin")
    newTopic("Constantes y Variables")
    //val a = 2
    //val a = "Hola"
    val a = true
    println("a = $a")
    //var b = 2
    var b:Int
    b = 5
    println("b = $b")

    // Esta variable puede ser nulo
    var objNull:Any?
    objNull = null
    objNull = "Hi"
    println(objNull)
}

fun newTopic(topic:String){
    print("\n$separator $topic $separator\n")
}