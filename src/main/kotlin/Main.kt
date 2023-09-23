import java.util.SimpleTimeZone

fun main() {
    var arr = arrayOf(1,2,3,4,5,6)
    arr.swap(1,3)
    arr.print()

}

fun Array<Int>.swap(i1:Int, i2:Int) {

    val el1 = this[i1]
    val el2 = this[i2]
    this[i1]  = el2
    this[i2]= el1
}

fun Array<Int>.print(){
    for (i in this){
        println(i)
    }
}