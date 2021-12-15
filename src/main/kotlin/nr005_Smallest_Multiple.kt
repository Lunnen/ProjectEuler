fun main() {

    val fromOneToThisNumber = 20
    val values: MutableList<Long> = mutableListOf()

    /* Fill array with nr's to calc */
    for(i in 1 until fromOneToThisNumber) {
        values.add(i.toLong())
    }

    println(lcmOfArray(values, 0))
}

// recursive implementation
fun lcmOfArray(inputArray: MutableList<Long>, idx: Int): Long {

    // lcm(a,b) = (a*b/gcd(a,b))
    if (idx == inputArray.size - 1) {
        return inputArray[idx]
    }
    val a = inputArray[idx]
    val b = lcmOfArray(inputArray, idx + 1)
    return a * b / gcd(a, b) //
}

// Recursive function to return gcd of a and b
fun gcd(a: Long, b: Long): Long {
    return if (b == 0L) a else gcd(b, a % b)
}

