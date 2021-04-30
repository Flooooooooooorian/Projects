package Student;

import java.util.*;

public class StudentDB {
    private final Map<String, Student> students = new HashMap<>();

    public StudentDB() {
    }

    public StudentDB(Student[] students) {
        for (Student student : students) {
            this.students.put(student.getId(), student);
        }
    }

    public StudentDB(Collection<Student> students) {
        for (Student student : students) {
            this.students.put(student.getId(), student);
        }
    }

    public List<Student> list() {
        return List.copyOf(this.students.values());
    }

    public Student randomStudent() {
        return (Student) this.students.values().toArray()[(int) (students.size() * Math.random())];
    }

    public void add(Student student) {
        this.students.put(student.getId(), student);
    }

    public void remove(Student student) {
        this.students.remove(student.getId());
    }

    public Student findFirstById(String id) {
        return this.students.get(id);
    }

//
//    public List<Student> findAllById(String id) {
//        List<Student> list = new ArrayList<>();
//        if (id == null) {
//            return list;
//        }
//
//        for (Student student : students) {
//            if (student.getId().equals(id)) {
//                list.add(student);
//            }
//        }
//        return list;
//    }

    public void removeById(String id) {
        this.students.remove(id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Student Student : this.students.values()) {
            sb.append(Student.toString()).append("\n");
        }
        return sb.toString();
    }
}
