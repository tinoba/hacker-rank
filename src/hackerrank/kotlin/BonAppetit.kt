package hackerrank.kotlin

fun main(args: Array<String>) {
    bonAppetit(intArrayOf(3, 10, 2, 9).toTypedArray(), 1, 12)
}

fun bonAppetit(bill: Array<Int>, k: Int, b: Int) = ((bill.sum() - bill[k]) / 2).let {
    println(if (it == b) "Bon Appetit" else b - it)
}