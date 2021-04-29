package Student;

import Student.ComputerScienceStudent;
import Student.StudentDB;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void list() {
        ArrayList<Student> computerScienceStudents = new ArrayList<>();

        computerScienceStudents.add(new ComputerScienceStudent("1", "Florian", "Weber"));
        computerScienceStudents.add(new ComputerScienceStudent("2", "b", "B"));
        computerScienceStudents.add(new ComputerScienceStudent("3", "c", "C"));

        StudentDB db = new StudentDB(computerScienceStudents);

        assertEquals(computerScienceStudents, db.list());
    }

    @Test
    void randomStudent() {
        ArrayList<Student> computerScienceStudents = new ArrayList<>();

        computerScienceStudents.add(new ComputerScienceStudent("1", "Florian", "Weber"));
        computerScienceStudents.add(new ComputerScienceStudent("2", "b", "B"));
        computerScienceStudents.add(new ComputerScienceStudent("3", "c", "C"));

        StudentDB db = new StudentDB(computerScienceStudents);
        System.out.println(db.randomStudent());
        assertNotNull(db.randomStudent());
    }

    @Test
    void testToString() {
        ArrayList<Student> computerScienceStudents = new ArrayList<>();

        computerScienceStudents.add(new ComputerScienceStudent("1", "Florian", "Weber"));
        computerScienceStudents.add(new ComputerScienceStudent("2", "b", "B"));
        computerScienceStudents.add(new ComputerScienceStudent("3", "c", "C"));

        StudentDB db = new StudentDB(computerScienceStudents);

        assertEquals("Student{id='1', givenName='Florian', surName='Weber'}\n" +
                "Student{id='2', givenName='b', surName='B'}\n" +
                "Student{id='3', givenName='c', surName='C'}\n", db.toString());
    }

    @Test
    void add() {
        ArrayList<Student> computerScienceStudents = new ArrayList<>();

        computerScienceStudents.add(new ComputerScienceStudent("1", "Florian", "Weber"));
        computerScienceStudents.add(new ComputerScienceStudent("2", "b", "B"));
        computerScienceStudents.add(new ComputerScienceStudent("3", "c", "C"));

        ComputerScienceStudent new_ComputerScience_student = new ComputerScienceStudent("4", "d", "D");

        StudentDB db = new StudentDB(computerScienceStudents);

        ArrayList<Student> new_ComputerScience_students = new ArrayList<>();

        new_ComputerScience_students.add(computerScienceStudents.get(0));
        new_ComputerScience_students.add(computerScienceStudents.get(1));
        new_ComputerScience_students.add(computerScienceStudents.get(2));
        new_ComputerScience_students.add(new_ComputerScience_student);

        db.add(new_ComputerScience_student);
        assertEquals(new_ComputerScience_students, db.list());
    }

    @Test
    void remove() {
        ArrayList<Student> computerScienceStudents = new ArrayList<>();
        ComputerScienceStudent old_ComputerScience_student = new ComputerScienceStudent("4", "d", "D");
        computerScienceStudents.add(new ComputerScienceStudent("1", "Florian", "Weber"));
        computerScienceStudents.add(new ComputerScienceStudent("2", "b", "B"));
        computerScienceStudents.add(new ComputerScienceStudent("3", "c", "C"));
        computerScienceStudents.add(old_ComputerScience_student);

        StudentDB db = new StudentDB(computerScienceStudents);

        ArrayList<Student> new_ComputerScience_students = new ArrayList<>();
        new_ComputerScience_students.add(computerScienceStudents.get(0));
        new_ComputerScience_students.add(computerScienceStudents.get(1));
        new_ComputerScience_students.add(computerScienceStudents.get(2));


        db.remove(old_ComputerScience_student);
        assertEquals(new_ComputerScience_students, db.list());
    }
}