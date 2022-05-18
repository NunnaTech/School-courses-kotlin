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

    fun isCourseRegister(courseName: String, course: Course) : Boolean{
        return if (courseName.equals(course.name)){
            println("ERROR: El curso $courseName ya ha sido registrado.")
            true;
        }else{
            println("¡El curso $courseName ha sido agregado satisfactoriamente!")
            false
        }
    }




}