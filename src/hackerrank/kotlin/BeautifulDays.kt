package hackerrank.kotlin

fun main(args: Array<String>) {
    println(beautifulDays(20, 23, 6))
}

fun beautifulDays(i: Int, j: Int, k: Int): Int {
    var total = 0

    for (value in i..j) {
        if ((Math.abs(value - value.toString().reversed().toInt()) % k == 0)) {
            total++
        }
    }
    return total
}