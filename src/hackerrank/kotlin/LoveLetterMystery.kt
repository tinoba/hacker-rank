package hackerrank.kotlin

fun main(args: Array<String>) {
    println(theLoveLetterMystery("abcd"))
}

fun theLoveLetterMystery(s: String): Int {

    val length = s.length / 2

    var total = 0

    for (i in 0 until length) {
        total += Math.abs(s[i].toInt() - s[s.length - 1 - i].toInt())
    }

    return total
}