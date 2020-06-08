import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val d = scanner.nextInt()

    for (x in 0..1000) {
        val isRoot = a * x.toDouble().pow(3) +
                b * x.toDouble().pow(2) + c * x + d == 0.0

        if (isRoot) println(x)
    }
}