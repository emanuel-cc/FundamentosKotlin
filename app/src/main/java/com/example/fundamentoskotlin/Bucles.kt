package com.example.fundamentoskotlin

fun main(){
    newTopic("Bucles")
    showPersons(p1 = "Angel", p2 = "Mary", p3 = "Fany")
    showPersons("Angel", "Mary", "Sergio", "Alex", "Carla")
}

fun showPersons(p1:String, p2:String, p3:String){
    println(p1)
    println(p2)
    println(p3)
}

fun showPersons(vararg persons:String ){
    newTopic("For")
    for (person in persons) println(person)

    newTopic("While")
    var index = 0
    while (index < persons.size){
        if(persons[index] == "Mary") println("Es Mary!!")
        println("$index ${persons[index]}")
        index++
    }

    newTopic("When")
    //Se establece un rango
    index = (0..persons.size-1).random()
    when(persons[index]){
        "Angel"-> println("Es Angel!")
        "Mary"->{
            println("Ir a otra pantalla")
            println(2+4)
        }
        else -> println(persons[index])
    }
}