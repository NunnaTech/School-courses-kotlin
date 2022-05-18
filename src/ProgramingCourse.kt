import java.util.concurrent.atomic.AtomicInteger

class ProgramingCourse(
    id: Int,
    name: String,
    description: String
) : Course(id, name, description) {

    companion object {
        private val id = AtomicInteger()
        fun newEntry(name: String, description: String) = ProgramingCourse(id.getAndIncrement(), name, description)
    }

    override fun toString(): String {
        return ("$id $name $description")
    }
}

val listProgramingCourse: MutableList<ProgramingCourse> = mutableListOf<ProgramingCourse>();