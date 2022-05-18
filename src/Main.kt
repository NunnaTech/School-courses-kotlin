

fun main(args:Array<String>){
    createCourseProgramming("Java", "Desde 0")
    createCourseProgramming("C", "Desde 0")
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

