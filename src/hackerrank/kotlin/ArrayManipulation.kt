package hackerrank.kotlin

fun main(args: Array<String>) {
    println(arrayManipulation(5, arrayOf(
            arrayOf(1, 2, 100),
            arrayOf(2, 5, 100),
            arrayOf(3, 4, 100))))
}

fun arrayManipulation(n: Int, queries: Array<Array<Int>>): Long {

    val list = LongArray(n)

    for (i in 0 until queries.size){
        for (j in queries[i][0]..queries[i][1]){
            list[j-1] = list[j-1]+queries[i][2]
        }
    }
    return list.max()!!.toLong()
}