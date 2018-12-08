package com.eyck.chap2

val upperCase1: (String) -> String = {str: String -> str.toUpperCase()}
val upperCase2: (String) -> String = {str -> str.toUpperCase()}
val upperCase3 = {str: String -> str.toUpperCase()}
val upperCase5: (String) -> String = {it.toUpperCase()}
val upperCase6: (String) -> String = String::toUpperCase

fun main(args:Array<String>){
    val lowerCase: String = "asfagaga"
    println(upperCase1(lowerCase))
    println(upperCase2(lowerCase))
    println(upperCase3(lowerCase))
    println(upperCase5(lowerCase))
    println(upperCase6(lowerCase))
}
