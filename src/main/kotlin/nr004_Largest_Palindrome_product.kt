
fun main() {

    var largest3digitPalindrome = 0

    for(x1 in 0 until 999){
        for(x2 in 0 until 999){

            val currNr = x1 * x2

            if ( isPalindrome( currNr.toString() ) && currNr > largest3digitPalindrome) largest3digitPalindrome = currNr
        }
    }

    println( largest3digitPalindrome )
}

fun isPalindrome(inputNr: String): Boolean {
    return inputNr ==  inputNr.reversed()
}