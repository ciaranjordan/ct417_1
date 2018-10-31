public class Student {

    private String name;
    private int age;
    private String dob;
    private int id;
    private String course;
    private String[] modules;

    public Student(String name, int age, String dob, int id, String course, String[] modules) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.course = course;
        this.modules = modules;
    }

    public String getUsername() {
        return name + Integer.toString(age);
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getModules() {
        String returnString = "";

        for (String module:this.modules) {
            returnString += module + " ";
        }

        return returnString;
    }
}
