package hackerrank.kotlin

fun main(args: Array<String>) {

    println(jumpingOnClouds(arrayOf(0, 0, 1, 0, 0, 1, 1, 0), 2))
}

fun jumpingOnClouds(c: Array<Int>, k: Int): Int {
    var life = 100
    var position = 0

    while (position < c.size){
        if (c[position] == 1) {
            life -= 3
        } else {
            life--
        }
        position+=k
    }

    return life
}