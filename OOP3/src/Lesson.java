public class Lesson {
    String lessonName;
    String lessonID;
    Student[] students;
    Department department;

    public Lesson(String lessonName, String lessonID) {
        this.lessonName = lessonName;
        this.lessonID = lessonID;
    }

    public Lesson(Lesson lesson, Student[] students, Department department) {
        this.lessonName = lesson.lessonName;
        this.lessonID = lesson.lessonID;
        this.students = students;
        this.department = department;
    }

    public void courseInformation() {
        System.out.println("Lesson Name: " + lessonName + "\nLesson ID: " + lessonID + "\nDepartment Information: "
                + "\nDepartment Name: " + department.departmentName + "\nDepartment ID: " + department.departmentID);

        System.out.println("Students enrolled in this course:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student Name: " + students[i].studentName + ", School ID: " + students[i].schoolID);
        }
    }
}
