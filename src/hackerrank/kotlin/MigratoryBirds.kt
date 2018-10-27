package hackerrank.kotlin

fun main(args: Array<String>) {
    println(migratoryBirds(intArrayOf(4, 1, 2, 3, 4, 5, 4, 3, 2, 1, 3).toTypedArray()))
}

fun migratoryBirds(arr: Array<Int>): Int {
    val groups = arr.groupBy { it }
    return groups.filter{ it.value.size == groups.maxBy{it.value.size}?.value?.size }.maxBy{it.key}?.key!!
}