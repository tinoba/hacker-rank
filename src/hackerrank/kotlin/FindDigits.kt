package hackerrank.kotlin

fun main(args: Array<String>) {
    println(findDigits(1012))
}

fun findDigits(n: Int) = n.toString().filter { it.toString().toInt() != 0 && n % it.toString().toInt() == 0 }.length
