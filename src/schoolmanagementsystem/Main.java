//package schoolmanagementsystem;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//
//	public static void main(String[] args) {
//		Teacher ramesh=new Teacher(1,"Ramesh",5000);
//		Teacher suresh=new Teacher(2,"Suresh",2000);
//		Teacher kholi=new Teacher(3,"Kholi",2500);
//		
//		List<Teacher> teacherList=new ArrayList<>();
//		teacherList.add(ramesh);
//		teacherList.add(suresh);
//		teacherList.add(kholi);
//		
//		Student shanmugam=new Student(8,"Shanmugam",1);
//		Student sugumar=new Student(10,"Sugumar",2);
//		Student abhishek=new Student(11,"Abhishek",3);
//		
//		List<Student> studentList=new ArrayList<>();
//		studentList.add(shanmugam);
//		studentList.add(sugumar);
//		studentList.add(abhishek);
//		
//		
//		School JIV=new School(teacherList,studentList);
//
//		shanmugam.payFees(5000);
//		System.out.println( "JIV has earned : "+  JIV.getTotalMoneyEarned());
//		
//		sugumar.payFees(6000);
//		System.out.println( "JIV has earned : "+  JIV.getTotalMoneyEarned());
//		
//		
//		System.out.println("--------------------JIV salary Detail----------------");
//		
//		ramesh.receiveSalary(ramesh.getSalary());
//		System.out.println("JIV has paid "+ramesh.getSalary()+" to "+ ramesh.getName()+ " and now has "+ JIV.getTotalMoneyEarned());
//		
//		
//	}
//
//}




package schoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher ramesh = new Teacher(1, "Ramesh", 5000);
        Teacher suresh = new Teacher(2, "Suresh", 2000);
        Teacher kholi = new Teacher(3, "Kholi", 2500);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(ramesh);
        teacherList.add(suresh);
        teacherList.add(kholi);

        Student shanmugam = new Student(8, "Shanmugam", 1);
        Student sugumar = new Student(10, "Sugumar", 2);
        Student abhishek = new Student(11, "Abhishek", 3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(shanmugam);
        studentList.add(sugumar);
        studentList.add(abhishek);

        // Create School
        School JIV = new School(teacherList, studentList);

        // Students paying fees
        shanmugam.payFees(JIV,5000);
        System.out.println("JIV has earned: ₹" + JIV.getTotalMoneyEarned());

        sugumar.payFees(JIV,6000);
        System.out.println("JIV has earned: ₹" + JIV.getTotalMoneyEarned());

        System.out.println("\n-------------------- JIV Salary Details ----------------");

        // Paying teachers' salaries
        ramesh.receiveSalary(JIV);
        System.out.println("JIV has paid " + ramesh.getSalary() + " to " + ramesh.getName() + " and now has ₹" + JIV.getTotalMoneyEarned());

        suresh.receiveSalary(JIV);
        System.out.println("JIV has paid " + suresh.getSalary() + " to " + suresh.getName() + " and now has ₹" + JIV.getTotalMoneyEarned());

        kholi.receiveSalary(JIV);
        System.out.println("JIV has paid " + kholi.getSalary() + " to " + kholi.getName() + " and now has ₹" + JIV.getTotalMoneyEarned());

        System.out.println("\nFinal Balance: ₹" + JIV.getTotalMoneyEarned());
    }
}
