package hackerrank.kotlin

fun main(args: Array<String>) {
    println(palindromeIndex("acbc"))
}

fun palindromeIndex(s: String): Int {

    if (s.reversed() == s) return -1

    val length = s.length/2

    for (i in 0..length){
        if (s[i] != s[s.length-1-i]){
            if (s[i+1] == s[s.length-1-i]){
                return i
            }else{
                return s.length-1-i
            }
        }
    }

    return -1
}