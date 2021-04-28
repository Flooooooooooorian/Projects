package Student;

import Student.ComputerScienceStudent;
import Student.StudentDB;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void list() {
        ComputerScienceStudent[] computerScienceStudents = new ComputerScienceStudent[3];

        computerScienceStudents[0] = new ComputerScienceStudent("1", "Florian", "Weber");
        computerScienceStudents[1] = new ComputerScienceStudent("2", "b", "B");
        computerScienceStudents[2] = new ComputerScienceStudent("3", "c", "C");

        StudentDB db = new StudentDB(computerScienceStudents);

        assertArrayEquals(computerScienceStudents, db.list());
    }

    @Test
    void randomStudent() {
        ComputerScienceStudent[] computerScienceStudents = new ComputerScienceStudent[3];

        computerScienceStudents[0] = new ComputerScienceStudent("1", "Florian", "Weber");
        computerScienceStudents[1] = new ComputerScienceStudent("2", "b", "B");
        computerScienceStudents[2] = new ComputerScienceStudent("3", "c", "C");

        StudentDB db = new StudentDB(computerScienceStudents);
        System.out.println(db.randomStudent());
        assertNotNull(db.randomStudent());
    }

    @Test
    void testToString() {
        ComputerScienceStudent[] computerScienceStudents = new ComputerScienceStudent[3];

        computerScienceStudents[0] = new ComputerScienceStudent("1", "Florian", "Weber");
        computerScienceStudents[1] = new ComputerScienceStudent("2", "b", "B");
        computerScienceStudents[2] = new ComputerScienceStudent("3", "c", "C");

        StudentDB db = new StudentDB(computerScienceStudents);

        assertEquals("Student{id='1', givenName='Florian', surName='Weber'}\n" +
                "Student{id='2', givenName='b', surName='B'}\n" +
                "Student{id='3', givenName='c', surName='C'}\n", db.toString());
    }

    @Test
    void add() {
        ComputerScienceStudent[] computerScienceStudents = new ComputerScienceStudent[3];

        computerScienceStudents[0] = new ComputerScienceStudent("1", "Florian", "Weber");
        computerScienceStudents[1] = new ComputerScienceStudent("2", "b", "B");
        computerScienceStudents[2] = new ComputerScienceStudent("3", "c", "C");

        ComputerScienceStudent new_ComputerScience_student = new ComputerScienceStudent("4", "d", "D");

        StudentDB db = new StudentDB(computerScienceStudents);

        ComputerScienceStudent[] new_ComputerScience_students = new ComputerScienceStudent[4];

        new_ComputerScience_students[0] = computerScienceStudents[0];
        new_ComputerScience_students[1] = computerScienceStudents[1];
        new_ComputerScience_students[2] = computerScienceStudents[2];
        new_ComputerScience_students[3] = new_ComputerScience_student;

        db.add(new_ComputerScience_student);
        assertArrayEquals(new_ComputerScience_students, db.list());
    }

    @Test
    void remove() {
        ComputerScienceStudent[] computerScienceStudents = new ComputerScienceStudent[4];
        ComputerScienceStudent old_ComputerScience_student = new ComputerScienceStudent("4", "d", "D");
        computerScienceStudents[0] = new ComputerScienceStudent("1", "Florian", "Weber");
        computerScienceStudents[1] = new ComputerScienceStudent("2", "b", "B");
        computerScienceStudents[2] = new ComputerScienceStudent("3", "c", "C");
        computerScienceStudents[3] = old_ComputerScience_student;

        StudentDB db = new StudentDB(computerScienceStudents);

        ComputerScienceStudent[] new_ComputerScience_students = new ComputerScienceStudent[3];
        new_ComputerScience_students[0] = computerScienceStudents[0];
        new_ComputerScience_students[1] = computerScienceStudents[1];
        new_ComputerScience_students[2] = computerScienceStudents[2];


        db.remove(old_ComputerScience_student);
        assertArrayEquals(new_ComputerScience_students, db.list());
    }
}