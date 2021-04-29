package Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StudentDB {
    private final ArrayList<Student> students = new ArrayList<>();

    public StudentDB() {
    }

    public StudentDB(Student[] students) {
        this.students.addAll(List.of(students));
    }

    public StudentDB(Collection<Student> students) {
        this.students.addAll(students);
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

    public Student findFirstById(String id) {
        if (id == null) {
            return null;
        }

        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }

        return null;
    }

    public List<Student> findAllById(String id) {
        List<Student> list = new ArrayList<>();
        if (id == null) {
            return list;
        }

        for (Student student : students) {
            if (student.getId().equals(id)) {
                list.add(student);
            }
        }
        return list;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Student Student : this.students) {
            sb.append(Student.toString()).append("\n");
        }
        return sb.toString();
    }
}
