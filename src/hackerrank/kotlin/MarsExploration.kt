package hackerrank.kotlin

fun main(args: Array<String>) {
    println(marsExploration("SOSSOT"))
}

fun marsExploration(s: String): Int {
    var total = 0
    for (i in 0 until s.length-2 step 3){
        if(s[i] != 'S'){
            total++
        }
        if (s[i+1]!= 'O'){
            total++
        }
        if (s[i+2]!= 'S'){
            total++
        }
    }
    return total
}