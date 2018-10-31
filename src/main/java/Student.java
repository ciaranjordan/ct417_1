public class Student {

    private String name;
    private int age;
    private String dob;
    private int id;
    private String username;
    private String course;
    private String[] modules;

    public Student(String name, int age, String dob, int id, String username, String course, String[] modules) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.username = username;
        this.course = course;
        this.modules = modules;
    }

    public String getUsername() {
        return name + Integer.toString(age);
    }
}