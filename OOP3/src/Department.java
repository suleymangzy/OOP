public class Department {
    String departmentName;
    String departmentID;
    Student[] students;
    Lesson[] lessons;

    public Department(String departmentName, String departmentID) {
        this.departmentName = departmentName;
        this.departmentID = departmentID;
    }

    public Department(Department department, Student[] students, Lesson[] lessons) {
        this.departmentName = department.departmentName;
        this.departmentID = department.departmentID;
        this.students = students;
        this.lessons = lessons;
    }

    public void departmentInformation() {
        System.out.println("Department Name: " + departmentName + "\nDepartment ID: " + departmentID);

        System.out.println("Courses offered by the department:");
        for (int i = 0; i < lessons.length; i++) {
            System.out.println("Lesson Name: " + lessons[i].lessonName + ", Lesson ID: " + lessons[i].lessonID);
        }

        System.out.println();

        System.out.println("Students in the department:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student Name: " + students[i].studentName + ", School ID: " + students[i].schoolID);
        }
    }
}
