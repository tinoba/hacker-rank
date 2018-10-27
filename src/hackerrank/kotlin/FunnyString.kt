package hackerrank.kotlin

fun main(args: Array<String>) {
    println(funnyString("acxz"))
}

fun funnyString(s: String): String {

    val a = mutableListOf<Int>()

    val b = s.reversed()

    for (i in 0 until s.length-1){
        a.add(Math.abs(s[i].toInt()- s[i+1].toInt()))
    }

    for (i in 0 until b.length-1){
       if (Math.abs(b[i].toInt()- b[i+1].toInt()) != a[i]){
           return "Not Funny"
       }
    }

    return "Funny"
}