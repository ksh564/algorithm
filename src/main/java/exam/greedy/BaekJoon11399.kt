package exam.greedy
fun main() {
    val readlineNum = readLine()!!.toInt()
    val arr = Array(readlineNum){ readLine()!!.toInt()}

    var sum = 0
    for(arg in arr){
        sum += arg
    }
    println("test:$sum")
}