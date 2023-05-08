public class StudentManager {
    public void logginStudent(Student student) {
        System.out.println("Öğrenci girişi başarılı:\n" + student.getFirstName() + " " + student.getLastName() + "\n" + student.getNumber() + "\n" + student.getEmail() + "\n");
    }
}
