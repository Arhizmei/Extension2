import java.util.SimpleTimeZone

fun main() {
    val a = "Hello"
    val b = a.getThirdLetter()
    println(b)
}

fun String.getThirdLetter(): Char {
   return this[1]
}