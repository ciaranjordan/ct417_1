public class Module {

    private String name;
    private String id;
    private Student[] students;
    private String[] courseIds;

    public Module(String name, String id, Student[] students, String[] courseIds) {
        this.name = name;
        this.id = id;
        this.students = students;
        this.courseIds = courseIds;
    }
}
