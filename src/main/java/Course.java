public class Course {

    private String name;
    private Module[] modules;
    private String academicStartDate;
    private String academicEndDate;

    public Course(String name, Module[] modules, String academicStartDate, String academicEndDate) {
        this.name = name;
        this.modules = modules;
        this.academicStartDate = academicStartDate;
        this.academicEndDate = academicEndDate;
    }

    public String getCourseDetails(){
        String returnString = "";

        returnString += "**Course Name: " + this.name + "**\n\n";
        returnString += "*Modules:*";

        for (Module module:modules) {
            returnString += "Module name: " + module.getName() + "\n";
            returnString += "Student Info: " + module.getStudentInfo() + "\n";
            returnString += "\n";
        }

        return returnString;
    }
}
