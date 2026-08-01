// WAJP to design a method which takes two employee object and return the employee having maximum salary

public class Employee
{
	String Name;
	long Phone; 
	String Address;
	String Email;
	int Age;
	int ID;
	String Department;
	double Salary;
	
	/*
	// Small code like as id , Nmae and Salary  Print then Use Small code
	public Employee(int ID, String Name, double Salary)
	{
		this.Name = Name;
		this.ID = ID;
		this.Salary = Salary;
	}
	
	
	@Override
	public String toString()
	{
		return "["+ this.ID + "," + this.Name + "," + this.Salary +"]";
	}
	
	public void displayInfo()
	{
		System.out.println("\n\t\t======Employee Details==========\n");
		System.out.println("Employee       Id      :\t " + ID);
		System.out.println("Employee Name          :\t " + Name);
		System.out.println("Employee Salary        :\t " + Salary);
	}*/
	
	// Use Full Details of Employee 
	
	public Employee(int ID, String Name, int Age, long Phone, String Address, String Email, String Department, double Salary)
	{
		this.Name = Name;
		this.Phone = Phone;
		this.Age = Age;
		this. Address = Address;
		this.Email = Email;
		this.ID = ID;
		this.Department = Department;
		this.Salary = Salary;
	}
	
	@Override
	public String toString()
	{
		return "["+ this.ID + "," + this.Name + "," + this.Age + "," + this.Phone + ", " + this.Address + "," + this.Email + "," + this.Department + "," + this.Salary +"]";
	}
	
	@Override	
	public boolean equals(Object o)
	{
		Employee cus = (Employee) o;
		return this.ID == cus.ID && this.Phone == cus.Phone; 
	}
		
	public void displayInfo()
	{
		System.out.println("\n\t\t======Employee Details==========\n");
		System.out.println("Employee       Id      :\t " + ID);
		System.out.println("Employee Name          :\t " + Name);
		System.out.println("Employee Phone Number  :\t " + Phone);
		System.out.println("Employee Address       :\t " + Address);
		System.out.println("Employee Email Id      :\t " + Email);		
		System.out.println("Employee Department Id :\t " + Department);
		System.out.println("Employee Salary        :\t " + Salary);
	}
}