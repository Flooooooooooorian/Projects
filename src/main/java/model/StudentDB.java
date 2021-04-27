package model;

public class StudentDB {
    private Student[] students;

    public StudentDB() {
        students = new Student[0];
    }

    public StudentDB(Student[] students) {
        this.students = students;
    }

    public Student[] list() {
        return this.students;
    }

    public Student randomStudent() {
        return students[(int) (students.length * Math.random())];
    }

    public void add(Student student) {
        Student[] new_students_array = new Student[this.students.length+1];
        System.arraycopy(this.students, 0, new_students_array, 0, students.length);
        new_students_array[new_students_array.length-1] = student;
        this.students = new_students_array;
    }

    public void remove(Student student) {
        Student[] new_students_array = new Student[this.students.length-1];
        for (int i = 0; i < students.length-1; i++) { //fails for all students after the one removed
            if (!this.students[i].equals(student)){
                new_students_array[i] = this.students[i];
            }
        }
        this.students = new_students_array;
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
