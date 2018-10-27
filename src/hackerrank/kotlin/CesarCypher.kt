package hackerrank.kotlin

fun main(args: Array<String>) {
    println(caesarCipher("www.abc.xy", 87))
}

fun caesarCipher(s: String, k: Int)= String(s.map {
    val b = k% 26
        if (it.isLowerCase()) {
            val l = (it + b).toInt()
            if (l > 'z'.toInt()) {
                (l % 'z'.toInt() + 'a'.toInt() - 1).toChar()
            } else {
                it + b
            }
        } else if (it.isUpperCase()) {
            val l = (it + b).toInt()
            if (l > 'Z'.toInt()) {
                (l % 'Z'.toInt() + 'A'.toInt() - 1).toChar()
            } else {
                it + b
            }
        } else {
            it
        }
    }.toCharArray())