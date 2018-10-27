package hackerrank.kotlin

fun main(args: Array<String>) {
    println(equalizeArray(arrayOf(1, 2, 3, 1, 2, 3, 3, 3)))
}

fun equalizeArray(arr: Array<Int>): Int {
    val a = arr.groupingBy { it }.eachCount()
    return arr.size - a[arr.max()!!]!!
}