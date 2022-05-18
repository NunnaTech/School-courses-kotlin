import java.util.concurrent.atomic.AtomicInteger
class CookingCourse(
    id: Int,
    name: String,
    description: String
) : Course(
    id, name, description
) {
    companion object {
        private val id = AtomicInteger()
        fun newEntry(name: String, description: String) = Course(id.getAndDecrement(), name, description)
        fun message(message:String):Unit{
            println("${message}")
        }
    }
}
val listCookingCourse = mutableListOf<CookingCourse>()