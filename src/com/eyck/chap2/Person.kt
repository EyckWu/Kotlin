package com.eyck.chap2

class Person constructor(firstName: String) {

    var name: String = ""

    init {
        name = firstName
    }

    fun printName(){
        println("name:" + name)
    }
}