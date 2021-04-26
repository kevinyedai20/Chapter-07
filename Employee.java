package Chapter07;
public class Employee 
{
	static String name = "";
	static double regularHoursWorked;
	static double regularHourlyRate;
	static double overtimeHours;
	static double bonusRate;
	static double overtimePay;
	static double bonusAmount;
	static double regularSalary;
	static double grossPay;
	
	public void setName(String name)
	{
		this.name = name;
	}

	public void setRegularHoursWorked(double regularHoursWorked) 
	{
		this.regularHoursWorked = regularHoursWorked;
	}

	public void setRegularHourlyRate(double regularHourlyRate)
	{
		this.regularHourlyRate = regularHourlyRate;
	}

	public void setOverloadHours(double overloadHours) 
	{
		this.overtimeHours = overloadHours;
	}

	public void setBonusRate(double bonusRate)
	{
		this.bonusRate = bonusRate;
	}
	
	public static double calcRegularPay()
	{
		regularSalary = regularHoursWorked * regularHourlyRate;
		return regularSalary;
	}
	
	public static double calcOvertimePay()
	{
		overtimePay = overtimeHours * regularHourlyRate * 2;
		return overtimePay;
	}
	
	public static double calcBonus()
	{
		bonusAmount = (regularSalary + overtimePay) * bonusRate;
		return bonusAmount;
	}
	
	public static double calcGrossPay()
	{
		grossPay = regularSalary + overtimePay + bonusAmount;
		return grossPay;
	}
}

