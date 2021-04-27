import model.ComputerScienceStudent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerScienceStudentTest {

    ComputerScienceStudent computerScienceStudent = new ComputerScienceStudent();

    @BeforeEach
    void setUpStudent() {
        computerScienceStudent.setId("id123");
        computerScienceStudent.setGivenName("Florian");
        computerScienceStudent.setSurName("Weber");
    }

    @Test
    public void testStudentEquals() {
        ComputerScienceStudent computerScienceStudent_old = new ComputerScienceStudent("123", "Florian", "Weber");
        ComputerScienceStudent computerScienceStudent_new = new ComputerScienceStudent("124", "Dieter", "Bohlen");
        ComputerScienceStudent computerScienceStudent_old_me = new ComputerScienceStudent("123", "Florian", "Neuer Nachname");

        assertFalse(computerScienceStudent_old.equals(computerScienceStudent_new));
        assertTrue(computerScienceStudent_new.equals(computerScienceStudent_old));
    }

    @Test
    public void testStudentSetId() {
        assertEquals("id123", computerScienceStudent.getId());
        computerScienceStudent.setId("id456");
        assertEquals("id456", computerScienceStudent.getId());
    }

    @Test
    public void testStudentGetId() {
        assertEquals("id123", computerScienceStudent.getId());
    }

    @Test
    public void testStudentSetGivenName() {
        assertEquals("Florian", computerScienceStudent.getGivenName());
        computerScienceStudent.setGivenName("Hans");
        assertEquals("Hans", computerScienceStudent.getGivenName());
    }

    @Test
    public void testStudentGetGivenName() {
        assertEquals("Florian", computerScienceStudent.getGivenName());
    }

    @Test
    public void testStudentSetSurName() {
        assertEquals("Weber", computerScienceStudent.getSurName());
        computerScienceStudent.setSurName("Müller");
        assertEquals("Müller", computerScienceStudent.getSurName());
    }

    @Test
    public void testStudentGetSurName() {
        assertEquals("Weber", computerScienceStudent.getSurName());
    }
}
