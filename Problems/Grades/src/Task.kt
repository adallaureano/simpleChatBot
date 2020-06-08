import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var (d, c, b, a) = listOf(0, 0, 0, 0)
    repeat(scanner.nextInt()) {
        when (scanner.nextInt()) {
            2 -> d += 1
            3 -> c += 1
            4 -> b += 1
            5 -> a += 1
        }
    }
    println("$d $c $b $a")
}