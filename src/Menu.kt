open class Menu {

    val valid = Validations();
    val crud = Crud();

    open fun printSeparator() {
        println("----------------------------")
    }

    fun printMenu() {
        printSeparator()
        println("Menú principal")
        printSeparator()
        println("1.- Registro de curso de cocina")
        println("2.- Registro de curso de programación")
        println("3.- Mostrar Todos los cursos")
        println("4.- Salir")
    }

    fun printSubMenu(category: String) {
        printSeparator()
        println("Sub Menú $category")
        printSeparator()
        println("1.- Añadir")
        println("2.- Actualizar")
        println("3.- Eliminar")
        println("4.- Buscar")
        println("5.- Regresar")
    }

    fun cookingMenu() {
        printSubMenu("Cooking")
        var subAswer: Int? = Validations().getPositiveInt("Selecciona una opción (1-4):")
        when (subAswer) {
            1 -> {
                var name: String = valid.getCourseName("Ingrese el nombre del curso: ")
                var description: String = valid.getCourseName("Ingrese la descripción del curso: ")
            }
            2 -> {
                var id = valid.getPositiveInt("Ingrese el id del curso a actualizar: ")


            }
            3 -> {
                var id = valid.getPositiveInt("Ingrese el id del curso a eliminar: ")
            }
            4 -> {
                var name: String = valid.getCourseName("Ingrese el nombre del curso: ")
            }
            5 -> return
            else -> println("opción no disponible")
        }
        return cookingMenu()
    }

    fun programingMenu() {
        printSubMenu("Programming")
        var subAswer: Int? = Validations().getPositiveInt("Selecciona una opción (1-4):")
        when (subAswer) {
            1 -> {
                var name: String = valid.getCourseName("Ingrese el nombre del curso: ")
                var description: String = valid.getCourseName("Ingrese la descripción del curso: ")
                crud.createCourseProgramming(name, description);
            }
            2 -> {
                var id: Int? = valid.getPositiveInt("Ingrese el id del curso a actualizar: ")
                var name: String = valid.getCourseName("Ingrese el nuevo nombre del curso: ")
                var description: String = valid.getCourseName("Ingrese la nueva descripción del curso: ")
                crud.updateProgrammingCourse(id, name, description);
            }
            3 -> {
                var id = valid.getPositiveInt("Ingrese el id del curso a eliminar: ")
                crud.deleteProgrammingCourse(id);
            }
            4 -> {
                var name: String = valid.getCourseName("Ingrese el nombre del curso: ")
                crud.selectCourseProgramming(name)
            }
            5 -> return
            else -> println("opción no disponible")
        }
        return programingMenu()
    }

    open fun start() {
        while (true) {
            printMenu()
            var mainAnswer: Int? = Validations().getPositiveInt("Selecciona una opción (1-4):")
            when (mainAnswer) {
                1 -> cookingMenu()
                2 -> programingMenu()
                3 -> {
                    crud.selectAllProgrammingCourses()
                }
                4 -> {
                    printSeparator()
                    println("Cerrando el sistema...")
                    break;
                }
                else -> println("opción no disponible")
            }
        }
    }

}