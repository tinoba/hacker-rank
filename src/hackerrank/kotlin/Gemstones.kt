package hackerrank.kotlin

fun main(args: Array<String>) {

    println(gemstones(arrayOf("abcdde", "baccd", "eeabg")))
}

fun gemstones(arr: Array<String>): Int {

    var set = arr[0].toSet()
    for (i in 1 until arr.size){
        set = set.intersect(arr[i].asIterable())
    }

    return set.size
}