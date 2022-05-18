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
        fun newEntry(name: String, description: String) = CookingCourse(id.getAndIncrement(), name, description)
    }

    override fun toString(): String {
        return ("$id $name $description")
    }
}