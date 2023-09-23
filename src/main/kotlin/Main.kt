import java.util.SimpleTimeZone

fun main() {
    var arr = arrayOf("a", "b", "c")
    arr.swap(1,2)
    arr.print()

}

fun <T> Array<T>.swap(i1:Int, i2:Int) {

    val el1 = this[i1]
    val el2 = this[i2]
    this[i1]  = el2
    this[i2]= el1
}

fun <T> Array<T>.print(){
    for (i in this){
        println(i)
    }
}