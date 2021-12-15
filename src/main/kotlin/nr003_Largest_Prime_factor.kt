
fun main(){

    var primeToCheck = 600851475143L

    var nrCheck = 1L

    while(primeToCheck > 1){

        nrCheck += 1
       if(primeToCheck % nrCheck == 0L) primeToCheck /= nrCheck

    }

    println(nrCheck)
}