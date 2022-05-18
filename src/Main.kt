fun main(args: Array<String>) {
    createCourseProgramming("Java", "Desde 0")
    createCourseProgramming("C", "Desde 0")
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

fun updateProgrammingCourse (id:Int,name:String, description: String){

    var index = listProgramingCourse.indexOf(listProgramingCourse.find{ it.id == id })

    if ( index != -1){
        listProgramingCourse[index].name = name
        listProgramingCourse[index].description
        println("INFO: Actualizado correctamente!")
    }else{
        println("ERROR: Curso no encontrado!")
    }
}

fun deleteProgrammingCourse(id:Int){
    var programingCoursePresent:ProgramingCourse? = listProgramingCourse.find{ it.id == id }
    if (programingCoursePresent != null){
        listProgramingCourse.removeIf { course -> course.id == id }
        println("INFO: Eliminado correctamente")
    }else{
        println("ERROR: No existe el curso buscado.")
    }
}

