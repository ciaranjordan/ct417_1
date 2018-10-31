import junit.framework.TestCase;

public class StudentTest extends TestCase {

    public void setUp() throws Exception {
    }

    public void tearDown() throws Exception {
    }

    public void testGetUsername() {
        String modules[] = {"CT417"};
        Student student1;
        student1 = new Student("John Doe", 18, "1/1/2000", 12345678, "CS&IT", modules);
        String expectedUsername = "John Doe18";
        String actualUsername = student1.getUsername();

        assertEquals(expectedUsername, actualUsername);
    }
}