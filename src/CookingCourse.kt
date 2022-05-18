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
        open fun newEntry(name: String, description: String) = CookingCourse(id.getAndIncrement(), name, description)

        fun message(message:String):Unit{
           println("${message}")
        }
    }

    override fun toString(): String {
        return ("$id $name $description")
    }
}

val listaCookingCourse:MutableList<CookingCourse> = mutableListOf<CookingCourse>()
