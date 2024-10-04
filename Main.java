public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("abc", "aaa", 1, 75, 2);
        Student student2 = new Student("def", "bbb", 2, 85, 1);
        Student student3 = new Student("ghi", "ccc");
        Student student4 = new Student("jkl", "ddd", 4);

        Course math = new Course("Mathematics", "Dr. Wilson", 2024);

        math.enroll(student1);
        math.enroll(student2);
        math.enroll(student3);
        math.enroll(student4);

        double average = math.averageGrade();
        System.out.println("Average grade in the course: " + average);

        math.ranking();

        math.isAboveAverage();
    }
}
