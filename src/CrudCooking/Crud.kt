package CrudCooking

import CookingCourse
import listCookingCourse

class Crud {

    fun deleteCouse(id:Int):Unit{
        val index= listCookingCourse.indexOf(listCookingCourse.find { it.id==id })
        if (index!=null){
            listCookingCourse.removeIf{it.id==id}
            CookingCourse.message("Se elimino correctamente")
        }
    }
    fun getAll():Unit{
        for (curso in listCookingCourse){
            CookingCourse.message("[${curso.id}] Nombre del curso: ${curso.name}\n Descripción: ${curso.description}")
        }
    }

}