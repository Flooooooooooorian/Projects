package Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDB {
    private ArrayList<Student> students;

    public StudentDB() {
        students = new ArrayList<>();
    }

    public StudentDB(ArrayList<Student> students) {
        this.students = students;
    }

    public List<Student> list() {
        return this.students;
    }

    public Student randomStudent() {
        return students.get((int) (students.size() * Math.random()));
    }

    public void add(Student student) {
        this.students.add(student);
    }

    public void remove(Student student) {
        this.students.remove(student);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Student Student : this.students) {
            sb.append(Student.toString()).append("\n");
        }
        return sb.toString();
    }
}
