fun main(args: Array<String>) {

}

fun createCourseProgramming(name: String, description: String) {
    var flag: Boolean = false;
    for (e in listProgramingCourse) {
        if (e.name.toUpperCase() == name.toUpperCase()) {
            flag = true
            break
        }
    }
    if (flag) ProgramingCourse.message("ERROR: El curso ya existe")
    else {
        listProgramingCourse.add(ProgramingCourse.newEntry(name, description))
        ProgramingCourse.message("INFO: El curso fue añadido")
    }
}

fun selectCourseProgramming(query: String) {
    val courseSearched: ProgramingCourse? = listProgramingCourse.find { it.name == query }
    if (courseSearched != null) {
        println("ÉXITO: Curso encontrado ${courseSearched.name} - ${courseSearched.description}")
    } else {
        ProgramingCourse.message("ERROR: El curso no fue encontrado")
    }
}

