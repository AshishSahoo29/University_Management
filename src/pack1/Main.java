package pack1;

public class Main {
	public static void main(String[] args) {
        // Creating objects for the university management system
        UniversityManagementSystem university = new UniversityManagementSystem();

        // Creating students
        Student student1 = new Student("S001", "Ashish");
        Student student2 = new Student("S002", "Sidhanta");

        // Adding students to the system
        university.addStudent(student1);
        university.addStudent(student2);

        // Creating teachers
        Teacher teacher1 = new Teacher("T001", "Dhruv Sir");
        Teacher teacher2 = new Teacher("T002", "Gourav Sir");

        // Adding teachers to the system
        university.addTeacher(teacher1);
        university.addTeacher(teacher2);

        // Creating courses
        Course course1 = new Course("C001", "Mathematics");
        Course course2 = new Course("C002", "Computer Science");

        // Adding courses to the system
        university.addCourse(course1);
        university.addCourse(course2);

        // Enrolling students in courses
        university.enrollStudentToCourse(student1, course1);
        university.enrollStudentToCourse(student2, course1);
        university.enrollStudentToCourse(student2, course2);

        // Displaying enrolled students for a specific course
        System.out.println("Students enrolled in Mathematics course:");
        for (Student student : course1.getEnrolledStudents()) {
            System.out.println("Student ID: " + student.getStudentId() + ", Name: " + student.getStudentName());
        }

        // Conducting exam for a course (optional extension)
        university.conductExam(course1);
        university.conductExam(course2);

        // Displaying marks obtained by students in a specific course (optional extension)
        university.displayStudentMarksForCourse(course1);
        university.displayStudentMarksForCourse(course2);
    }
}
