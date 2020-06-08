import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    var prod: Long = 1

    for (i in a until b) {
        prod *= i
    }
    print(prod)
}
/*
    var sum: Long = 0
    for (i in a until b) {
        sum += (i * i).toLong()
    }
    println(sum)

    val m = (a..b).reduce {accumulator, element ->
    accumulator * element
    }
    print(m)
 */