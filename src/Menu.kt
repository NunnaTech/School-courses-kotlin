import java.util.*

open class Menu {

    open fun printSeparator(){
        println("----------------------------")
    }
    open fun printMenu(){
        printSeparator()
        println("Menú principal")
        printSeparator()
        println("1.- Registro de curso de cocina")
        println("2.- Registro de curso de programación")
        println("3.- Mostrar Todos los cursos")
        println("4.- Salir")
    }

    open fun start(){
        while (true){
            printMenu()
            var mainAnswer : Int? = Validations().getPositiveInt("Selecciona una opción (1-4):")
        }
    }

}