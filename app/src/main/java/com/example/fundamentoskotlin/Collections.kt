package com.example.fundamentoskotlin

import com.example.fundamentoskotlin.classes.Group
import com.example.fundamentoskotlin.classes.User

fun main(){
    newTopic("Colecciones")
    newTopic("Solo lectura")
    val frutaList = listOf("Manzana", "Banana", "Uva", "Lima")
    println(frutaList.get((0..frutaList.size-1).random()))
    //Métodos nativos
    println("Index de Uva es ${frutaList.indexOf("Uva")}")

    //Colecciones que si se pueden modificar en tiempo de ejecución
    // Y conservar la parte de la lectura
    newTopic("Mutable List")
    val myUser = User(0, name = "Antonio", lastName = "Cocom", group = Group.FAMILY.ordinal)
    //Se alteran los datos
    val bro = myUser.copy(id = 1, name = "Ivan")
    val friend = bro.copy(id = 2, group = Group.FRIEND.ordinal)
    val usersList = mutableListOf(myUser, bro)
    println(usersList)
    usersList.add(friend)
    println(usersList)
    //usersList.removeAt(1)
    usersList.remove(bro)
    println(usersList)

    val usersSelectList = mutableListOf<User>()
    println(usersSelectList)
    //usersSelectList.addAll(usersList)
    usersSelectList.add(myUser)
    println(usersSelectList)
    //Reemplaza al elemento de la lista
    usersSelectList.set(0, bro)
    println(usersSelectList)
    usersSelectList.add(myUser)
    usersSelectList.add(myUser)
    println(usersSelectList)

    newTopic("Map")
    //Funciona en base a una clave y valor
    val usersMap = mutableMapOf<Int, User>()
    println(usersMap)
    usersMap.put(myUser.id.toInt(), myUser)
    usersMap.put(myUser.id.toInt(), myUser)
    println(usersMap)
    usersMap.put(friend.id.toInt(), friend)
    println(usersMap)
    //Eliminar un elemento
    usersMap.remove(2)
    println(usersMap)
    println(usersMap.isEmpty())
    println(usersMap.containsKey(0))
    usersMap.put(bro.id.toInt(), bro)
    usersMap.put(friend.id.toInt(), friend)
    println(usersMap)
    //Se imprimen solo las claves del map
    println(usersMap.keys)
    // Se imprime solo los valores
    println(usersMap.values)
}