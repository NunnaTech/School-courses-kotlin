import java.util.concurrent.atomic.AtomicInteger

open class Course(
    var id: Int,
    var name: String,
    var description: String
) {
    companion object {
        private val id = AtomicInteger()
        fun newEntry(name: String, description: String) = Course(id.getAndDecrement(), name, description)
    }
}