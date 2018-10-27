package hackerrank.kotlin

fun main(args: Array<String>) {
    println(beautifulBinaryString("0100101010"))
}

fun beautifulBinaryString(b: String) = (b.length - b.replace("010", "").length)/3
