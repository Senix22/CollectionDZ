package com.senix22.collectiondz

import java.util.*

fun main(){
    sortMap()
    findMostCounted()
}

fun findMostCounted(){
    val list = listOf("one", "two","one","three","five","three","one")
    println(list.groupingBy { it }.eachCount().maxByOrNull{ it.value })

}
fun sortMap(){
    val map = mapOf<Int,String>(1 to "A",2 to "B", 5 to "C", 4 to "D", 35 to "F")
    val sorted = map.toSortedMap()
    println(sorted.keys)
}