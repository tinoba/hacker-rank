package hackerrank.kotlin

fun main(args: Array<String>) {
    println(pageCount(6, 2))
}

fun pageCount(n: Int, p: Int): Int {

    var total = n
    if (n % 2 == 0){
        total++
    }
    val left = p/2
    val right = (total-p)/2

    return if (left< right) left else right

}