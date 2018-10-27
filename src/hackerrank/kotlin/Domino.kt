package hackerrank.kotlin

fun main(args: Array<String>) {

   // println(dominos("1<2,2<2,3<4,4<2,3<5,5<5,5<5"))

    println(isPrime(1))
}

fun dominos(s: String) : Int {

    var count = 1
    var counter = 0

    val d = s.split(",")
    for (i in 0..d.size-2){
        val first = d[i].split("<")[1]
        val second = d[i+1].split("<")[0]

        if (first == second){
            count++
        }else{
            if (count> counter){
                counter = count
            }
            count = 1
        }
    }
    return if (count!= 0) count else counter
}

fun isPrime(n : Int) : Boolean{
    for (i in 2 until n){
        if (n % i == 0){
            return false
        }
    }
    return true
}