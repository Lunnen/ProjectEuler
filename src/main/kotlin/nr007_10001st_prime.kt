/*
10001st prime
Show HTML problem content
Problem 7
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10_001st prime number?
 */

fun main() {

    var primeNumbers = mutableListOf<Long>()

    var counter: Long = 2
    while(primeNumbers.size < 10001){
        if (isPrime(counter)) primeNumbers.add(counter)
        counter++
    }
    println(primeNumbers.last())
}
fun isPrime(nr: Long): Boolean{

    // Corner case
    if (nr <= 1) return false

    // Check from 2 to n-1
    for (i in 2 until nr) if (nr % i == 0.toLong()) return false

    return true
}