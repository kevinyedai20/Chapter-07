package Chapter07;
public class EmployeeDemo 
{
	public static void main(String[] args)
	{
		Employee Employee1 = new Employee();
		Employee1.setName("Kevin");
		Employee1.setRegularHoursWorked(40);
		Employee1.setRegularHourlyRate(17);
		Employee1.setOverloadHours(5);
		Employee1.setBonusRate(0.7);
		displayResults();

		Employee Employee2 = new Employee();
		Employee2.setName("Janet");
		Employee2.setRegularHoursWorked(35);
		Employee2.setRegularHourlyRate(15);
		Employee2.setOverloadHours(20);
		Employee2.setBonusRate(0.5);
		displayResults();
		
		Employee Employee3 = new Employee();
		Employee3.setName("Mario");
		Employee3.setRegularHoursWorked(32);
		Employee3.setRegularHourlyRate(13);
		Employee3.setOverloadHours(8);
		Employee3.setBonusRate(0.4);
		displayResults();
	}

	public static void displayResults() 
	{
		Employee.calcRegularPay();
		Employee.calcOvertimePay();
		Employee.calcBonus();
		Employee.calcGrossPay();
		System.out.println("Name: " + Employee.name);
		System.out.println("Salary: $" + String.format("%.2f" , + Employee.regularSalary));
		System.out.println("Overtime Pay: $" + String.format("%.2f" , + Employee.overtimePay));
		System.out.println("Bonus Amount: $" + String.format("%.2f" , + Employee.bonusAmount));
		System.out.println("Gross Pay: $" + String.format("%.2f" , + Employee.grossPay));
		System.out.println("");
	}
}