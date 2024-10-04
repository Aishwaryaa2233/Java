import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Course {
    String courseName;
    String professorName;
    int year;
    List<Student> students;

    public Course(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.students = new ArrayList<>();
    }

    public void enroll(Student student) {
        students.add(student);
    }

    public void enroll(Student[] studentsArray) {
        for (Student student : studentsArray) {
            students.add(student);
        }
    }

    public void unEnroll(Student student) {
        students.removeIf(s -> s.registration == student.registration);
    }

    public int countStudents() {
        return students.size();
    }

    public int bestGrade() {
        int best = 0;
        for (Student student : students) {
            if (student.grade > best) {
                best = student.grade;
            }
        }
        return best;
    }

    public double averageGrade() {
        if (students.isEmpty()) {
            return 0;
        }
        int totalGrades = 0;
        for (Student student : students) {
            totalGrades += student.grade;
        }
        return (double) totalGrades / students.size();
    }

    public void ranking() {
        students.sort(Comparator.comparingInt(Student::getGrade).reversed());
        System.out.println("Ranking of students:");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println((i + 1) + ". " + student.firstName + " " + student.lastName + " - Grade: " + student.grade);
        }
    }

    public void isAboveAverage() {
        double average = averageGrade();
        System.out.println("Students above average:");
        for (Student student : students) {
            if (student.grade > average) {
                System.out.println(student.firstName + " " + student.lastName + " is above average.");
            } else {
                System.out.println(student.firstName + " " + student.lastName + " is not above average.");
            }
        }
    }
}

