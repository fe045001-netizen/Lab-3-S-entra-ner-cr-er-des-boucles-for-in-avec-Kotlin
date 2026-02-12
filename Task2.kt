fun main() {
    val height = 5

    for (i in 1..height) {

        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) {
            print(" ")
        }

        val numberOfStars = 11 - i * 2
        for (j in 1..numberOfStars) {
            print("*")
        }

        println()
    }
}
