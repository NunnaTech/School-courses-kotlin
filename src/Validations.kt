class Validations {



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