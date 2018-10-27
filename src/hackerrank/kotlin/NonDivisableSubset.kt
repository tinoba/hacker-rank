package hackerrank.kotlin

fun main(args: Array<String>) {
    println(nonDivisibleSubset(3, arrayOf(1, 7, 2, 4)))
}

fun nonDivisibleSubset(k: Int, S: Array<Int>): Int {

    var total = 0

    for (i in 0 until S.size) {
        val a = mutableListOf<Int>()
        a.add(S[i])
        for (j in i+1 until S.size){
            if (a.all { (it+S[j]) %k != 0 }){
                a.add(S[j])
            }
            if (a.size> total){
                total = a.size
            }
        }
    }
    return total
}