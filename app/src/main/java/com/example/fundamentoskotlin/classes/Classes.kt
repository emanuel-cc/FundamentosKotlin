package com.example.fundamentoskotlin.classes

import com.example.fundamentoskotlin.newTopic

fun main(){
    newTopic("Clases")
    val phone:Phone = Phone(12345678)
    phone.showNumber()
    phone.call()

    newTopic("Herencia")
    val smartphone = Smartphone(2345678, isPrivate = true)
    smartphone.call()

    newTopic("Sobreescritura")
    smartphone.showNumber()
    println("Es privado? ${smartphone.isPrivate}")

    newTopic("Data Classes")
    val myUser = User(0, name = "Antonio", lastName = "Cocom", group = Group.FAMILY.ordinal)
    //Se alteran los datos
    val bro = myUser.copy(id = 1, name = "Ivan")
    val friend = bro.copy(id = 2, group = Group.FRIEND.ordinal)
    // Se accede al apellido
    println(myUser.component3())
    //Se accede a todas las propiedades del data class
    println(myUser)
    println(bro)
    println(friend)

    newTopic("Funciones de alcance")
    //Se aplican múltiples acciones para un mismo objeto en una sola sentencia
    // Es decir, en un mismo bloque de código
    with(smartphone){
        //Aquitodo el contexto es la instancia smartphone
        println("Privado? $isPrivate")
        call()
    }

    //Nos sirve para configurar un objeto en un solo apartado
    /*friend.group = Group.WORK.ordinal
    friend.name = "Juan"
    friend.lastName = "Tellez"*/

    //Otra forma de hacerlo
    friend.apply {
        group = Group.WORK.ordinal
        name = "Juan"
        lastName = "Tellez"
    }
    println(friend)
}