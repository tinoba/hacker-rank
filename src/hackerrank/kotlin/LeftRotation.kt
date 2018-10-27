package hackerrank.kotlin

fun main(args: Array<String>) {

    println(rotLeft(arrayOf(1, 2, 3, 4, 5), 2))
}

fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    val b = mutableListOf<Int>()

    for (i in 0 until a.size) {

        b.add(a[(i + d) % a.size])
    }

    return b.toTypedArray()
}