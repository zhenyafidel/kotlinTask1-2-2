fun main() {
    val likes: Int = 121
    val countOfUsers: String = if (likes == 1 || likes % 10 == 1 && likes % 100 !== 11) "человеку" else "людям"
    println("Понравилось $likes $countOfUsers")
}