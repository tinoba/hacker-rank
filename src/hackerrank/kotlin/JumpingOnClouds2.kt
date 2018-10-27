package hackerrank.kotlin

fun main(args: Array<String>) {
    println(jumpingOnClouds(arrayOf(0, 0, 0, 0, 1, 0)))
}

fun jumpingOnClouds(c: Array<Int>): Int {
    var total = 0
    var i = 0
    while (i != c.size-1){
        i += if (i+2 < c.size && c[i+2] == 0){
            2
        }else{
            1
        }
        total ++
    }
    return total
}