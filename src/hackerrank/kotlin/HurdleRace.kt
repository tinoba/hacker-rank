package hackerrank.kotlin

fun main(args: Array<String>) {
    println(hurdleRace(4, arrayOf(1, 6, 3, 5, 2)))
}

fun hurdleRace(k: Int, height: Array<Int>): Int {
    val a = height.max()!!.minus(k)
    return if (a >= 0) a else 0
}
