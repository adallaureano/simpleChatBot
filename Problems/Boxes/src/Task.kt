import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val box1 = IntArray(3) { scanner.nextInt() }.sortedDescending()
    val box2 = IntArray(3) { scanner.nextInt() }.sortedDescending()
    println(
            when {
                box1[2] == box2[2] && box1[1] == box2[1] && box1[0] == box2[0] -> "Box 1 = Box 2"
                box1[2] >= box2[2] && box1[0] >= box2[0] && box1[1] >= box2[1] -> "Box 1 > Box 2"
                box1[2] <= box2[2] && box1[0] <= box2[0] && box1[1] <= box2[1] -> "Box 1 < Box 2"
                else -> "Incomparable"
            }
    )
}
/*
    val box1 = scanner.nextLine()
            .split(" ")
            .map { it.toInt() }
            .sorted()
    val box2 = scanner.nextLine()
            .split(" ")
            .map { it.toInt() }
            .sorted()
    if (box1[0] == box2[0] && box1[1] == box2[1] && box1[2] == box2[2]) {
        println("Box 1 = Box 2")
    } else if (box1[0] <= box2[0] && box1[1] <= box2[1] && box1[2] <= box2[2]) {
        println("Box 1 < Box 2")
    } else if (box1[0] >= box2[0] && box1[1] >= box2[1] && box1[2] >= box2[2]) {
        println("Box 1 > Box 2")
    } else println("Incomparable")
 */