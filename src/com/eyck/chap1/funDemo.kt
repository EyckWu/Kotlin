package com.eyck.chap1

fun sum(a: Int, b: Int): Int{
    return a + b;
}

fun sum1(a: Int, b: Int) = a + b

fun maxOf(a: Int, b: Int): Int{
    if (a > b){
        return a
    }else{
        return b
    }
}

fun maxOf1(a: Int, b: Int) = if (a > b) a else b

fun describe(obj: Any): String =
    when(obj){
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "Unknown"
    }

fun main(args: Array<String>){
    println(sum(2, 3))
    println(sum(3, 4))
    var a = 1
    val s1 = "a is $a"
    println(s1)

    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)

    val items = listOf<String>("apple", "banana", "kiwifruit")
    for (item in items){
        println(item)
    }

    var index = 0
    while (index < items.size){
        println("item at $index is ${items[index]}")
        index++
    }

    for (item in items){
        println(describe(item))
    }

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits.filter{it.startsWith("a")}
            .sortedBy{it}
            .map { it.toUpperCase() }
            .forEach{println(it)}
}
