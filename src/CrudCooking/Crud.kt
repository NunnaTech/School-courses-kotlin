package CrudCooking

<<<<<<< HEAD
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
=======
import listaCookingCourse

class Crud {
    fun addNewCourse(name:String, description:String):Unit{
        val index = listaCookingCourse.indexOf(listaCookingCourse.find { it.name==name })
        if (index != -1){
            if (name.isNotEmpty()&& description.isNotEmpty()){
                val newEntry = CookingCourse.newEntry(name, description)
                listaCookingCourse.add(newEntry)
                CookingCourse.message("El curso con el nombre ${newEntry.name} se registro correctamente")
            }else{
                CookingCourse.message("Ocurrio un error en el sistema")
            }
        }else{
            CookingCourse.message("Este curso ya existe en el sistema")
        }
    }

    fun updateCourse(id:Int, name: String,description: String):Unit{
        val index = listaCookingCourse.indexOf(listaCookingCourse.find { it.id == id })
        if (index!= -1){
            listaCookingCourse[index].name = name
            listaCookingCourse[index].description = description
            CookingCourse.message("Se actualizo correctamente")
        }else{
            CookingCourse.message("El registro con el id ${id} no existe")
        }
    }

}
>>>>>>> 6d42f6f62864bcf42c60f51272a68b45e806218e
