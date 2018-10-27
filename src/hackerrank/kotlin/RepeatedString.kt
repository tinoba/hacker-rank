package hackerrank.kotlin

fun main(args: Array<String>) {
    println(repeatedString("aba", 7))
}

fun repeatedString(s: String, n: Long) =
        s.count { it == 'a' } * (n / s.length) + s.substring(0, (n % s.length).toInt()).count { it == 'a' }

