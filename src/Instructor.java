public class Instructor extends User {
    private String coursesName;
    private String coursesTotalTime;

    public String getCoursesName() {
        return coursesName;
    }

    public void setCoursesName(String coursesName) {
        this.coursesName = coursesName;
    }

    public String getCoursesTotalTime() {
        return coursesTotalTime;
    }

    public void setCoursesTotalTime(String coursesTotalTime) {
        this.coursesTotalTime = coursesTotalTime;
    }
}
