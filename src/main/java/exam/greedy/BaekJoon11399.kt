package exam.greedy
fun main() = with(System.`in`) {
    val readlineNum = readLine()!!.toInt()
    val arr = Array(readlineNum){ readLine()!!.toInt()}
    arr.sort()
    var sum = 0
    var totalSum = 0
    for(money in arr){
        sum += money
        totalSum += sum
    }
    println("test$totalSum////$sum")
}