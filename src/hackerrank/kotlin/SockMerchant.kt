package hackerrank.kotlin

fun main(args: Array<String>) {
    println(sockMerchant(9, intArrayOf(1, 1, 3, 1, 2, 1, 3, 3, 3, 3).toTypedArray()))
}

fun sockMerchant(n: Int, ar: Array<Int>) = ar.groupingBy { it }.eachCount().filter { it.value > 1 }.values.fold(0) { acc, i -> acc + i / 2 }
