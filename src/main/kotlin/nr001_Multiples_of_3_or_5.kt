
fun main() {

    println( (0..999).filter { (it != 0 && (it % 3 == 0 || it % 5 == 0)) }.sum() )

}