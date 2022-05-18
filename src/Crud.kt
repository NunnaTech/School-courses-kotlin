class Crud {


    fun deleteCourseCooking(id: Int?): Unit {
        val index:Int = listaCookingCourse.indexOf(listaCookingCourse.find { it.id == id })
        if (index != null) {
            listaCookingCourse.removeIf { it.id == id }
            CookingCourse.message("Se elimino correctamente")
        }
    }

    fun getAll(): Unit {
        println("LISTA DE LOS CURSOS DE PROGRAMACIÓN-----------------")
        for (e in listProgramingCourse) println(e)
        println("LISTA DE LOS CURSOS DE COCINA-----------------------")
        for (curso in listaCookingCourse) {
            CookingCourse.message("[${curso.id}] Nombre del curso: ${curso.name}\n Descripción: ${curso.description}")
        }
    }

    fun updateCourse(id: Int?, name: String, description: String): Unit {
        val index:Int = listaCookingCourse.indexOf(listaCookingCourse.find { it.id == id })
        if (index != -1) {
            listaCookingCourse[index].name = name
            listaCookingCourse[index].description = description
            CookingCourse.message("Se actualizo correctamente")
        } else {
            CookingCourse.message("El registro con el id ${id} no existe")
        }
    }


    fun addNewCourse(name: String, description: String): Unit {
        val index:Int = listaCookingCourse.indexOf(listaCookingCourse.find { it.name == name })
        if (index != null) {
            if (name.isNotEmpty() && description.isNotEmpty()) {
                val newEntry: CookingCourse = CookingCourse.newEntry(name, description)
                listaCookingCourse.add(newEntry)
                CookingCourse.message("El curso con el nombre ${newEntry.name} se registro correctamente")
            } else {
                CookingCourse.message("Ocurrio un error en el sistema")
            }
        } else {
            CookingCourse.message("Este curso ya existe en el sistema")
        }
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
            println("ÉXITO: Curso encontrado ID: ${courseSearched.id} NAME: ${courseSearched.name} DESCRIPCIÓN:${courseSearched.description}")
        } else {
            ProgramingCourse.message("ERROR: El curso no fue encontrado")
        }
    }

    fun selectCourseCooking(query: String) {
        val courseSearched: CookingCourse? = listaCookingCourse.find { it.name == query }
        if (courseSearched != null) {
            println("ÉXITO: Curso encontrado ID: ${courseSearched.id} NAME: ${courseSearched.name} DESCRIPCIÓN:${courseSearched.description}")
        } else {
            ProgramingCourse.message("ERROR: El curso no fue encontrado")
        }
    }

    fun updateProgrammingCourse(id: Int?, name: String, description: String) {
        var index:Int = listProgramingCourse.indexOf(listProgramingCourse.find { it.id == id })
        if (index != -1) {
            listProgramingCourse[index].name = name
            listProgramingCourse[index].description
            println("INFO: Actualizado correctamente!")
        } else {
            println("ERROR: Curso no encontrado!")
        }
    }

    fun deleteProgrammingCourse(id: Int?) {
        var programingCoursePresent: ProgramingCourse? = listProgramingCourse.find { it.id == id }
        if (programingCoursePresent != null) {
            listProgramingCourse.removeIf { course -> course.id == id }
            println("INFO: Eliminado correctamente")
        } else {
            println("ERROR: No existe el curso buscado.")
        }
    }

}