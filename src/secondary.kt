open class student(var name: String, var surname: String, val id: Int){
    fun studentDatas() : String {
        return name + surname + id
    }
}

open class lesson(var lessonName: String, var credits: Int){
    fun lessonDatas(): String {
        return lessonName + credits
    }
}

class studentInfoSystem {
    val students = ArrayList<student>()
    val lessons = ArrayList<lesson>()

    fun addStudent(student: student) {
        students.add(student)
    }

    fun addLesson(lesson: lesson){
        lessons.add(lesson)
    }

    fun showStudentDatas() {
        students.forEach { println(it.studentDatas()) }
    }

    fun showLessonDatas() {
        lessons.forEach { println(it.lessonDatas()) }
    }
}


fun main() {
    val student1 = student("Javidan", "Nasib", 123456)
    val student2 = student("Vusal", "Ismayilov", 135791)

    val lesson1 = lesson(lessonName = "Physics", credits = 4)
    val lesson2 = lesson("Biology", 3)

    val system = studentInfoSystem()

    system.addLesson(lesson1)
    system.addLesson(lesson2)

    system.addStudent(student1)
    system.addStudent(student2)


    system.showStudentDatas()
    system.showLessonDatas()
}
