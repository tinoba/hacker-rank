package toptal

fun main(args: Array<String>) {
    println(task1("5 2 * 2 * 4 +"))
}
/*
rpnCalculator("5 2 + 3 *") // 21
rpnCalculator("5 2 * 2 * 4 +") // 24
rpnCalculator("5") // 5
rpnCalculator("0 1 *") // 0
 */

fun task1(a : String) : Int{

    var s = a.split(" ")

    var total = 0
    if (s.size >2){
        var first = s[0].toInt()
var second = s[1].toInt()
        for(i in 2 until s.size){
            if (s[i] == "+"){
                if (total == 0){
                    total += first+second
                }else{
                    total += first
                }

            }else if (s[i] == "*"){
                if (total == 0){
                    total += first*second
                }else{
                    total*= first
                }

            }else{
                first = s[i].toInt()
            }
        }
    }else{
        return s[0].toInt()
    }

    return total
}