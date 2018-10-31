public class Course {

    private String name;
    private Module[] modules;
    private String[] students;
    private String academicStartDate;
    private String academicEndDate;

    public Course(String name, Module[] modules, String[] students, String academicStartDate, String academicEndDate) {
        this.name = name;
        this.modules = modules;
        this.students = students;
        this.academicStartDate = academicStartDate;
        this.academicEndDate = academicEndDate;
    }
}