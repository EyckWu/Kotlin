package com.eyck.chap1

fun String.spaceToCamelCase(): String{
    return this.replace(" ", "")
}

fun main(args: Array<String>){
    println("Convert this to camelcase".spaceToCamelCase())
}