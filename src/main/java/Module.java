public class Module {

    private String name;
    private String id;
    private String[] studentIds;
    private String[] courseIds;

    public Module(String name, String id, String[] studentIds, String[] courseIds) {
        this.name = name;
        this.id = id;
        this.studentIds = studentIds;
        this.courseIds = courseIds;
    }
}
