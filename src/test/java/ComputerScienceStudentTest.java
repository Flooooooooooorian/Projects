import model.ComputerScienceStudent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerScienceStudentTest {

    @Test
    public void testStudentEquals() {
        ComputerScienceStudent computerScienceStudent_old = new ComputerScienceStudent("123", "Florian", "Weber");
        ComputerScienceStudent computerScienceStudent_new = new ComputerScienceStudent("124", "Dieter", "Bohlen");
        ComputerScienceStudent computerScienceStudent_old_me = new ComputerScienceStudent("123", "Florian", "Neuer Nachname");

        assertFalse(computerScienceStudent_old.equals(computerScienceStudent_new));
        assertTrue(computerScienceStudent_old_me.equals(computerScienceStudent_old));
    }

    @Test
    public void testStudentSetId() {
        ComputerScienceStudent computerScienceStudent = new ComputerScienceStudent("id123", "Florian", "Weber");
        assertEquals("id123", computerScienceStudent.getId());
        computerScienceStudent.setId("id456");
        assertEquals("id456", computerScienceStudent.getId());
    }

    @Test
    public void testStudentGetId() {
        ComputerScienceStudent computerScienceStudent = new ComputerScienceStudent("id123", "Florian", "Weber");
        assertEquals("id123", computerScienceStudent.getId());
    }

    @Test
    public void testStudentSetGivenName() {
        ComputerScienceStudent computerScienceStudent = new ComputerScienceStudent("123", "Florian", "Weber");
        assertEquals("Florian", computerScienceStudent.getGivenName());
        computerScienceStudent.setGivenName("Hans");
        assertEquals("Hans", computerScienceStudent.getGivenName());
    }

    @Test
    public void testStudentGetGivenName() {
        ComputerScienceStudent computerScienceStudent = new ComputerScienceStudent("123", "Florian", "Weber");
        assertEquals("Florian", computerScienceStudent.getGivenName());
    }

    @Test
    public void testStudentSetSurName() {
        ComputerScienceStudent computerScienceStudent = new ComputerScienceStudent("123", "Florian", "Weber");
        assertEquals("Weber", computerScienceStudent.getSurName());
        computerScienceStudent.setSurName("Müller");
        assertEquals("Müller", computerScienceStudent.getSurName());
    }

    @Test
    public void testStudentGetSurName() {
        ComputerScienceStudent computerScienceStudent = new ComputerScienceStudent("123", "Florian", "Weber");
        assertEquals("Weber", computerScienceStudent.getSurName());
    }
}
