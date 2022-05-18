import java.util.*

open class Menu {
    open fun getPositiveInt(message: String): Int? {
        val sc = Scanner(System.`in`)
        print(message)
        try {
            val possibleNumber: Int? = sc.nextInt()
            return if (possibleNumber!! > 0) possibleNumber else getPositiveInt(message)
        } catch (e: Exception) {
            println("ese no es un número valido.")
            return getPositiveInt(message)
        }
    }

    open fun getPositiveDouble(message: String): Double? {
        val sc = Scanner(System.`in`)
        print(message)
        try {
            val possibleNumber: Double? = sc.nextDouble()
            return if (possibleNumber!! > 0) possibleNumber else getPositiveDouble(message)
        } catch (e: Exception) {
            println("ese no es un número valido.")
            return getPositiveDouble(message)
        }
    }
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
            var mainAnswer : Int? = getPositiveInt("Selecciona una opción (1-4):")

        }
    }

}