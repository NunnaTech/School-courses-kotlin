import java.util.*

open class Menu {

    open fun printSeparator(){
        println("----------------------------")
    }
     fun printMenu(){
        printSeparator()
        println("Menú principal")
        printSeparator()
        println("1.- Registro de curso de cocina")
        println("2.- Registro de curso de programación")
        println("3.- Mostrar Todos los cursos")
        println("4.- Salir")
    }
     fun printSubMenu(category: String){
        printSeparator()
        println("Sub Menú $category")
        printSeparator()
        println("1.- Añadir")
        println("2.- actualizar")
        println("3.- buscar")
        println("4.- Regresar")
    }
    fun cookingMenu(){
        printSubMenu("Cooking")
        var subAswer : Int? = Validations().getPositiveInt("Selecciona una opción (1-4):")
        when (subAswer){
            1 -> println("1")
            2 -> println("2")
            3 -> println("3")
            4 -> return
            else -> println("opción no disponible")
        }
        return cookingMenu()
    }
    fun programingMenu(){
        printSubMenu("Programming")
        var subAswer : Int? = Validations().getPositiveInt("Selecciona una opción (1-4):")
        when (subAswer){
            1 -> println("1")
            2 -> println("2")
            3 -> println("3")
            4 -> return
            else -> println("opción no disponible")
        }
        return cookingMenu()
    }

    open fun start(){
        while (true){
            printMenu()
            var mainAnswer : Int? = Validations().getPositiveInt("Selecciona una opción (1-4):")
            when (mainAnswer) {
                1 -> cookingMenu()
                2 -> programingMenu()
                3 -> {
                    println("3")
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