package pack1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniversityManagementSystem {
	 private List<Student> students;
	    private List<Teacher> teachers;
	    private List<Course> courses;
	    private Map<String, Map<String, Integer>> studentMarks; // Optional extension

	    public UniversityManagementSystem() {
	        this.students = new ArrayList<>();
	        this.teachers = new ArrayList<>();
	        this.courses = new ArrayList<>();
	        this.studentMarks = new HashMap<>(); // Optional extension
	    }

	    // Methods for managing students
	    public void addStudent(Student student) {
	        students.add(student);
	    }

	    public void removeStudent(Student student) {
	        students.remove(student);
	    }

	    // Methods for managing teachers
	    public void addTeacher(Teacher teacher) {
	        teachers.add(teacher);
	    }

	    public void removeTeacher(Teacher teacher) {
	        teachers.remove(teacher);
	    }

	    // Methods for managing courses
	    public void addCourse(Course course) {
	        courses.add(course);
	    }

	    public void removeCourse(Course course) {
	        courses.remove(course);
	    }

	    // Enrollment methods
	    public void enrollStudentToCourse(Student student, Course course) {
	        course.enrollStudent(student);
	    }

	    public void removeStudentFromCourse(Student student, Course course) {
	        course.removeStudent(student);
	    }

	    // Optional extension: Exam functionality
	    public void conductExam(Course course) {
	        // Conduct exam for the given course
	        // Logic to assign marks to students (for demonstration purposes, marks are random)
	        Map<String, Integer> marks = new HashMap<>();
	        for (Student student : course.getEnrolledStudents()) {
	            int studentMarks = (int) (Math.random() * 100); // Generating random marks
	            marks.put(student.getStudentId(), studentMarks);
	        }
	        studentMarks.put(course.getCourseId(), marks);
	    }

	    public void displayStudentMarksForCourse(Course course) {
	        // Display marks obtained by each student in the given course
	        if (studentMarks.containsKey(course.getCourseId())) {
	            System.out.println("Marks obtained by students in course " + course.getCourseName() + ":");
	            Map<String, Integer> marks = studentMarks.get(course.getCourseId());
	            for (Map.Entry<String, Integer> entry : marks.entrySet()) {
	                String studentId = entry.getKey();
	                int mark = entry.getValue();
	                System.out.println("Student ID: " + studentId + ", Marks: " + mark);
	            }
	        } else {
	            System.out.println("No marks found for this course yet.");
	        }
	    }

}
