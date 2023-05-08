public class UserManager {
    public void openCourse(Instructor instructor) {
        System.out.println(instructor.getFirstName() + instructor.getLastName() + " Adlı Eğitmen " +
                instructor.getCoursesName() + " kursunu açtı" + "\nToplam Kurs Süresi : " + instructor.getCoursesTotalTime() + "\n");
    }

    public void courseStudent(Student students, Instructor instructor) {
        System.out.println("Kursa devam eden öğrenciler\n" + students.getFirstName() + " " + students.getLastName() + "\nKurs Adı : " + instructor.getCoursesName() + "Eğitmen : " +
                instructor.getFirstName() + " " + instructor.getLastName() + "\nTamamlanma Orani : %" + students.getCourseComplate() + "\n");
    }
}
