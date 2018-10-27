package hackerrank.kotlin

fun main(args: Array<String>) {
    println(camelcase("oneTwoThree"))
}

fun camelcase(s: String) = s.count { it.isUpperCase() } + 1

