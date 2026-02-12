fun main() {
    val height = 5

    for (i in 1..height) {

        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) {
            print(" ")
        }

        val numberOfStars = height + 1 - i
        for (j in 1..numberOfStars) {
            print("*")
        }

        println()
    }
}
