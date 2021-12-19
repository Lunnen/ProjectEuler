/*
Sum square difference
Show HTML problem content
Problem 6
The sum of the squares of the first ten natural numbers is,

The square of the sum of the first ten natural numbers is,

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

fun main() {

    println( checkDifference(100) )
}
fun checkDifference(fromOneTo: Int): String {

    var resultSumSquare = 0
    var sumOfTheSquares = 1
    repeat (fromOneTo){
        resultSumSquare += (sumOfTheSquares * sumOfTheSquares)
        sumOfTheSquares++
    }

    var resultSquareSum = 0
    var squareSumCounter = 1
    repeat (fromOneTo){
        resultSquareSum += squareSumCounter
        squareSumCounter++
    }
    resultSquareSum *= resultSquareSum // Square itself

    return "$resultSquareSum minus $resultSumSquare = ${(resultSquareSum - resultSumSquare)}"
}