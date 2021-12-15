
fun main() {

    val untilThis = 4_000_000
    var sumOfEven = 0

    var counter = 1
    while(getFibb(counter) <= untilThis){
        if(getFibb(counter) % 2 == 0) sumOfEven += getFibb(counter)
        counter++
    }
    println(sumOfEven)
}

fun getFibb(currNr: Int): Int{
    return if( currNr == 0 || currNr == 1 ) 1 else (getFibb(currNr -1) + getFibb(currNr - 2))
}

