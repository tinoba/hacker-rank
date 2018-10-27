package hackerrank.kotlin

fun main(args: Array<String>) {
    println(libraryFine(9, 6, 2015, 6, 6, 2015))
}

fun libraryFine(d1: Int, m1: Int, y1: Int, d2: Int, m2: Int, y2: Int) = when {
    y1 < y2 -> 0
    y1 > y2 -> 10000
    m1 < m2 -> 0
    m1 > m2 -> (m1 - m2) * 500
    d1 > d2 -> (d1 - d2) * 15
    else -> 0
}

