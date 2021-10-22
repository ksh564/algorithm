package exam.sort

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    val input = Array<Int>(N, { 0 })
    val countingArray = Array(N,{0})
    var i: Int = 0
    val strbuilder = StringBuilder()
    repeat(N) {
        val token = StringTokenizer(br.readLine())
        val value = token.nextToken().toInt()

        input[i] = value
        i++
    }

    for(item in input){
        countingArray[item]++
    }
    for(i in countingArray){
        countingArray[i]
    }
}

