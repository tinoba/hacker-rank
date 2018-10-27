package hackerrank.kotlin

fun main(args: Array<String>) {
    println(viralAdvertising(5))
}

fun viralAdvertising(n: Int): Int {
    var shared = 5
    var totalLiked = 0

    for (i in 0 until n){
        val liked = Math.floorDiv(shared, 2)
        shared = liked*3
        totalLiked+= liked
    }
    return totalLiked
}