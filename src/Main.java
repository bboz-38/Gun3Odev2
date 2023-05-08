public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demirog");
        instructor.setEmail("demirog@gmail.com");
        instructor.setCoursesName("Java/React");
        instructor.setCoursesTotalTime("360dk");

        Student student = new Student();
        student.setId(2);
        student.setFirstName("Burhan");
        student.setLastName("Boz");
        student.setEmail("bboz@gmail.com");
        student.setNumber("12345");
        student.setCourseComplate(72);

        Student student2 = new Student();
        student2.setId(2);
        student2.setFirstName("Orhan");
        student2.setLastName("Boz");
        student2.setEmail("oboz@gmail.com");
        student2.setNumber("78910");
        student2.setCourseComplate(28);


        StudentManager studentManager = new StudentManager();
        studentManager.logginStudent(student);
        studentManager.logginStudent(student2);


        InstructorManager instructorManager = new InstructorManager();
        instructorManager.logginSite(instructor);

        UserManager courseManager = new UserManager();
        courseManager.openCourse(instructor);
        courseManager.courseStudent(student, instructor);
        courseManager.courseStudent(student2, instructor);

    }
}
