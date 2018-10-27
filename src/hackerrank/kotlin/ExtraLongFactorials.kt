package hackerrank.kotlin

import java.math.BigInteger

fun main(args: Array<String>) {
    extraLongFactorials(3)
}

fun extraLongFactorials(n: Int) {
    var total: BigInteger = BigInteger.valueOf(1)
    for (i in 2..n){
        total = total.multiply(BigInteger.valueOf(i.toLong()))
    }
    println(total)
}