fun main() {
    val height = 5

    // Montée
    for (i in 1..height) {

        val numberOfSpaces = height - i
        for (j in 1..numberOfSpaces) print(" ")

        val numberOfStars = i
        for (j in 1..numberOfStars) print("*")

        println()
    }

    // Descente
    for (i in height - 1 downTo 1) {

        val numberOfSpaces = height - i
        for (j in 1..numberOfSpaces) print(" ")

        val numberOfStars = i
        for (j in 1..numberOfStars) print("*")

        println()
    }
}
