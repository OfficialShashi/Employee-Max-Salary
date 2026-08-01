import java.util.Scanner;


public class Main
{
	public static Employee getMaxPaidSal(Employee e1, Employee e2)
	{
		if (e1.Salary > e2.Salary)
		{
			return e1;
		}
		else{
			return e2;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		Employee obj = new Employee(101,"Rahul",26, 6363636363L, "Noida", "R123@hmail.com", "IT",46000.0);
		Employee obj1 = new Employee(101,"Ram",36, 6223636363L, "Delhi", "R12345@hmail.com", "HR",49000.0);		
		Employee Emp = Main.getMaxPaidSal(obj , obj1);	
		while(true)
		{			
			System.out.print("\n\n\t========Select the Option for Task Perform========\n\n");
			System.out.println("\n Press 1 To Select Task 1 \t\t Press 2 To Select Task 2 ");
			System.out.println("\n Press 3 Back to Main Menu \t\t Press 0 Exit ");
			System.out.print("\n Select Task  :\t "); int x = sc.nextInt();
			if( x == 0)
			{
				break;
			}
			if (x == 1)
			{
				if ( obj == obj1)
				{
					System.out.print("\n They have Same Object Address\n ");
				}
				else 
				{
				System.out.print("\n They donot have Same Object Address\n ");
				}			
			}else if ( x == 2 )
			{
				if ( obj .equals(obj1))
				{
					System.out.print("\n They have Same ID and Phone Number \n");
				}
				else{
					System.out.print("\n They do not have Same ID and Phone Number \n");
				}
			}
			else{
				System.out.print("\n Please Select Valid Input \n");
			}		
			Emp.displayInfo();
			System.out.print("\n\n\t\t Name is " + Emp.Name + " --> His Salary is High \n");
		}
	}	
}