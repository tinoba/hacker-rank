package hackerrank.kotlin

fun main(args: Array<String>) {
    println(squares(3, 9))
}

fun squares(a: Int, b: Int) = (Math.floor(Math.sqrt(b.toDouble())) - Math.ceil(Math.sqrt(a.toDouble())) + 1.0).toInt()
