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

fun updateProgrammingCourse (name:String){
    var _name = name.toUpperCase()

    var oldProgramingCourse:ProgramingCourse? = listProgramingCourse.find{ it.name.toUpperCase() == _name }
    println(oldProgramingCourse.toString())
    if ( oldProgramingCourse != null){
        println("Ingresa el nuevo nombre: ")
        var newName:String?  = readLine()
        println("Ingresa la nueva description: ")
        var newDescription:String? = readLine()

        for (item in listProgramingCourse){
            if(item.name.toUpperCase().equals(_name)){
                if (newName != null && newDescription != null) {
                    item.name = newName
                    item.description = newDescription
                };
            }
        }
        println("Actualizado correctamente.")
    }else{
        println("Curso no encontrado!")
    }
}

fun deleteProgrammingCourse(){

}

