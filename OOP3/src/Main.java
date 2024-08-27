// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Creating students
        Student student = new Student("John Doe", "38");
        Student student1 = new Student("Jane Smith", "39");
        Student student2 = new Student("Alice Johnson", "40");

        Student[] students = {student, student1, student2};
        Student[] lessonStudents = {student, student1};

        // Creating lessons
        Lesson lesson = new Lesson("Object-Oriented Programming", "20117");
        Lesson lesson1 = new Lesson("Database Management Systems", "20118");
        Lesson lesson2 = new Lesson("Software Requirements Analysis", "20119");
        Lesson lesson3 = new Lesson("Data Structures", "20120");

        Lesson[] departmentLessons = {lesson, lesson1, lesson2, lesson3};
        Lesson[] studentLessons = {lesson, lesson2};

        // Creating a department
        Department department = new Department("Software Engineering", "121010");

        // Displaying department information
        Department departmentInfo = new Department(department, students, departmentLessons);
        departmentInfo.departmentInformation();

        System.out.println();

        // Displaying student information
        Student studentInfo = new Student(student, studentLessons, department);
        studentInfo.studentInformation();

        System.out.println();

        // Displaying course information
        Lesson courseInfo = new Lesson(lesson, lessonStudents, department);
        courseInfo.courseInformation();
    }
}