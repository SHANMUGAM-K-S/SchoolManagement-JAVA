//package schoolmanagementsystem;
//
//import java.util.List;
//
//public class School {
//
//	   private List<Teacher> teachers;
//	   private List<Student> students;
//	   private static int totalMoneyEarned;
//	   private static int totalMoneySpent;
//	   
//	public School(List<Teacher> teachers, List<Student> students) {
////		super();
//		this.teachers = teachers;
//		this.students = students;
//		totalMoneyEarned=0;
//		totalMoneySpent=0;
//	}
//	
///**
// * 
// * @return the list of the teachers in the school
// */
//	public List<Teacher> getTeachers() {
//		return teachers;
//	}
//	
///**
// * 
// * @return adds a teachers to the school
// */
//	public void addTeacher(Teacher teacher) {
//		teachers.add(teacher);
//	}
//	
//	
//	
///**
// * 
// * @return the list of the students in the school
// */
//	public List<Student> getStudents() {
//		return students;
//	}
//	/**
//	 * 
//	 * @return adds a students to the school
//	 */
//	public void addStudents(Student student) {
//	students.add(student);
//	}
//	
//	
//	/**
//	 * @return the total money earned by the school
//	 */
//	public int getTotalMoneyEarned() {
//		return totalMoneyEarned ;
//	}
//	
//	/**
//	 * @return adds the total money earned by the school
//	 */
//	public static void updateTotalMoneyEarned(int MoneyEarned) {
//		totalMoneyEarned += MoneyEarned;
//	}
//	
//	/**
//	 * 
//	 * @return total money spent by the school
//	 */
//	public int getTotalMoneySpent() {
//		return totalMoneySpent;
//	}
//	/**
//	 * 
//	 * @param update that money spent by school which is the salary given by the school to its teachers .
//	 */
//	public static void updateTotalMoneySpent(int moneySpent) {
//		totalMoneySpent -= moneySpent;
//	}
//	   
//	
//	
//}










package schoolmanagementsystem;

import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    /**
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * @return the list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the school
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * @return the total money earned minus the money spent (net balance)
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned - totalMoneySpent;
    }

    /**
     * Updates the total money earned by the school when a student pays fees
     */
    public void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     * @return the total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Updates the total money spent by the school (when paying teacher salaries)
     */
    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent;
    }
}

