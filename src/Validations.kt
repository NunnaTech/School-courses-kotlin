import java.util.*

class Validations {

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

    fun getCourseName(message:String): String {
        val validates = Regex("^[A-Za-z0-9 _-]*$")
            try {
                print(message)
                var inputString = readLine().toString();
                if (inputString != null) {
                    if (inputString.matches(validates)) {
                        inputString = inputString.toUpperCase()
                        return inputString;
                    } else {
                        println("ERROR: Solo se permiten letras, números y guiones en el nombre.")
                        return getCourseName(message)
                    }
                }
            } catch (e: Exception) {
                println("ERROR: Solo se permiten letras, números y guiones en el nombre.")
                return getCourseName(message)
            }
        return getCourseName(message)
    }
}