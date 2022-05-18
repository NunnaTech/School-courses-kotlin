

fun main(args:Array<String>){
    createCourseProgramming("Java", "Desde 0")
    createCourseProgramming("C", "Desde 0")
    updateProgrammingCourse("Java")
}

fun createCourseProgramming(name:String, description:String){
    val _name = name.toUpperCase()
    var flag:Boolean = false;
    for (e in listProgramingCourse){
        if(e.name.equals(_name)){
            flag = true
            break
        }
    }

    if(flag){
    }

    val programingCourse: ProgramingCourse = ProgramingCourse.newEntry(name, description)
    println(programingCourse.toString())
}

fun updateProgrammingCourse (name:String){
    var _name = name.toUpperCase()

    var oldProgramingCourse:ProgramingCourse? = listProgramingCourse.find{ it.name.toUpperCase() == _name }
    println(oldProgramingCourse.toString())
    if ( oldProgramingCourse != null){
        println("Ingresa el nuevo nombre: ")
        var newName:String?  = readLine()
        println("Ingresa la nueva description: ")
        var newDescription:String? = readLine()

        for (item in listProgramingCourse){
            if(item.name.toUpperCase().equals(_name)){
                if (newName != null && newDescription != null) {
                    item.name = newName
                    item.description = newDescription
                };
            }
        }
        println("Actualizado correctamente.")
    }else{
        println("Curso no encontrado!")
    }
}

fun deleteProgrammingCourse(){

}

