


class Employee{
	int Salary =50000;
}
class Engineer extends Employee{
	int benefits=10000;
}
public class Inheritance {
	public static void main(String[] args) {
		Engineer E1=new Engineer();
		
		System.out.println(E1.benefits);
		System.out.println(E1.Salary);

	}

}
