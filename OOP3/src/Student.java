public class Student {
    String studentName;
    String schoolID;
    Lesson[] lessons;
    Department department;

    public Student(String studentName, String schoolID) {
        this.studentName = studentName;
        this.schoolID = schoolID;
    }

    public Student(Student student, Lesson[] lessons, Department department) {
        this.studentName = student.studentName;
        this.schoolID = student.schoolID;
        this.lessons = lessons;
        this.department = department;
    }

    public void studentInformation() {
        System.out.println("Student's Information: \nName: " + studentName + "\nSchool ID: " + schoolID
                + "\nDepartment Name: " + department.departmentName + "\nDepartment ID: " + department.departmentID);

        System.out.println("Lessons enrolled:");
        for (int i = 0; i < lessons.length; i++) {
            System.out.println("Lesson Name: " + lessons[i].lessonName + ", Lesson ID: " + lessons[i].lessonID);
        }
    }
}
