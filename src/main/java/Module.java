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

    public String getName() {
        return name;
    }

    public String getStudentInfo() {
        String returnString = "---\n";

        for (Student student:this.students) {
            returnString += "Student name: " + student.getName() + "\n";
            returnString += "Student Username: " + student.getUsername() + "\n";
            returnString += "Student Course: " + student.getCourse() + "\n";
            returnString += "Student Modules: " + student.getModules() + "\n";
            returnString += "---\n";
        }

        return returnString;
    }
}
