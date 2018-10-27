package hackerrank.kotlin

fun main(args: Array<String>) {
    weightedUniformStrings("aaabbbbcccddd", arrayOf(9,7,8,12,5)).forEach { println(it) }
}

fun weightedUniformStrings(s: String, queries: Array<Int>): Array<String> {

    val a  = mutableListOf<String>()
    val b = mutableSetOf<Int>()

    s.groupingBy { it }.eachCount().forEach {
        for (i in (1..it.value)) {
            b.add((it.key.toInt()-96)*i)
        }
    }
    queries.forEach {
        if (b.contains(it)){
            a.add("Yes")
        }else{
            a.add("No")
        }
    }
    return a.toTypedArray()
}