package hackerrank.kotlin

fun main(args: Array<String>) {
    chainingLetters(arrayOf("A>I", "S>P", "P>A", "I>N"))
}

fun chainingLetters(arr: Array<String>) {

    val map = mutableMapOf<String, String>()
    arr.forEach {
        val group = it.split(">")
        val first = group[0]
        val second = group[1]
        map[first] = second
    }

    var firstLetter = map.keys.first { !map.entries.groupBy { it.value }.containsKey(it) }

    var result = firstLetter

    arr.forEach {
        val next = map[firstLetter]
        result+= next
        firstLetter = next.toString()
    }
    println(result)
}