//package schoolmanagementsystem;
//
//public class Teacher {
//
//	private int id;
//	private String name;
//	private int salary;
//	private int salaryEarned;
//	public Teacher(int id, String name, int salary) {
////		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		this.salaryEarned=0;
//		
//	}
//	
//	public int getId() {
//		return this.id;
//	}
//	
//	public String getName() {
//		return this.name;
//	}
//	
//	public int getSalary() {
//		return this.salary;
//	}
//	
////	set the salary for the teacher
//	public void setSalary(int salary) {
//		this.salary=salary;
//	}
//	
//	
//	/**
//	 * removes from the total money earned by the school
//	 * @param salary
//	 */
//	public void receiveSalary(int salary) {
//		salaryEarned+=salary;
//		School.updateTotalMoneySpent(salary);
//	}
//}






package schoolmanagementsystem;

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    // Set a new salary for the teacher
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Pays the teacher and deducts salary from the school's total earnings.
     * Ensures the school has enough funds before making the payment.
     */
    public void receiveSalary(School school) {
        if (school.getTotalMoneyEarned() >= salary) { // Check if school has enough money
            salaryEarned += salary;
            school.updateTotalMoneySpent(salary);
            System.out.println(name + " has been paid ₹" + salary + ". Total salary earned: ₹" + salaryEarned);
        } else {
            System.out.println("Not enough funds to pay " + name + "'s salary of ₹" + salary);
        }
    }
}
