package mate.academy

fun greetUsers() {
    var name: String?

    while (true) {
        println("Please enter a name (or press Enter to quit): ")
        name = readLine()
        if (name.isNullOrEmpty()) {
            break
        }
        println("Hello, $name!")
    }
}

fun main() {
    greetUsers()
}
