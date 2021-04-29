package Student;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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


    @Test
    public void testFindFirstByIdEmptyDB() {
        StudentDB db = new StudentDB();

        assertNull(db.findFirstById("123"));
    }

    @Test
    public void testFindFirstByIdNotInDB() {
        StudentDB db = new StudentDB();
        db.add(new ComputerScienceStudent("123", "Max", "Mustermann"));

        assertNull(db.findFirstById("124"));
    }

    @Test
    public void testFindFirstByIdMultipleStudents() {
        StudentDB db = new StudentDB();
        db.add(new ComputerScienceStudent("123", "Max", "Mustermann"));
        db.add(new ComputerScienceStudent("123", "Hans", "Köhler"));

        assertEquals(new ComputerScienceStudent("123", "Max", "Mustermann"), db.findFirstById("123"));
    }

    @Test
    public void testFindAllById() {
        StudentDB db = new StudentDB();
        db.add(new ComputerScienceStudent("1", "Max", "Mustermann"));
        db.add(new ComputerScienceStudent("2", "Max", "Mustermann"));
        db.add(new ComputerScienceStudent("1", "Max", "Mustermann"));
        db.add(new ComputerScienceStudent("1", "Max", "Mustermann"));
        db.add(new ComputerScienceStudent("5", "Max", "Mustermann"));

        List<Student> list = List.of(new ComputerScienceStudent("1", "Max", "Mustermann"),
                new ComputerScienceStudent("1", "Max", "Mustermann"),
                new ComputerScienceStudent("1", "Max", "Mustermann"));

        assertEquals(list, db.findAllById("1"));
    }
}