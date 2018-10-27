package hackerrank.kotlin

fun circularArrayRotation(a: Array<Int>, k: Int, queries: Array<Int>) =
        queries.map { a[(it + k - 1) % a.size] }.toTypedArray()