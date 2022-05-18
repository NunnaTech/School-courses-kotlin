package CrudCooking

import listaCookingCourse

class Crud {
    fun addNewCourse(name:String, description:String){
        if (name.isNotEmpty()&& description.isNotEmpty()){
            val newEntry = CookingCourse.newEntry(name, description)
            listaCookingCourse.add(newEntry)
            CookingCourse.message("El curso con el nombre ${newEntry.name} se registro correctamente")
        }else{
            CookingCourse.message("Ocurrio un error en el sistema")
        }
    }

    fun updateCourse(id:Int, name: String,description: String){
        val index = listaCookingCourse.indexOf(listaCookingCourse.find { it.id == id })
        listaCookingCourse[index].name = name
        listaCookingCourse[index].description = description
        CookingCourse.message("Se actualizo correctamente")
    }
    
}

fun main(args: Array<String>) {

}