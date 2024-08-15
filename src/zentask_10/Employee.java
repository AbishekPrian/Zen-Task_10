package zentask_10;


public class Employee {
	int id;
	String firstName,lastName;
	int salary;

	Employee(int empid,String FirstName,String LastName,int Salary)
	{
		
		id = empid;
		firstName = FirstName;
		lastName = LastName;
		salary = Salary;
	}

	public int getid()
	{
		return id;
	}
	
	public String getfirstName() 
	{
		return firstName;
	}
	
	public String getlastName() 
	{
		return lastName;
	}
	
	public String getName() 
	{
		return firstName + " " + lastName;
	}
	
	public int getsalary() 
	{
		return salary;
	}
	
	public void setsalary(int Salary) 
	{
		salary = Salary;
	}
	
	public int getAnnualsalary() 
	{
		return salary*12;
	}
	
	public int raiseSalary(int percent) 
	{
		int newSalary=salary * percent/100;
		salary += newSalary;
		return salary;
	}
	
	public String toString() 
	{
		return "Employee ID : " + id +"\n"+"Name : "+ getName() +"\n"+ "AnnualSalary : " + getAnnualsalary() + "\n" + "Salary raise per month : "+salary;
	}
	
	//Main method
	public static void main(String[] args) {

		Employee emp = new Employee(01,"Abishek","Prian",20000);
		emp.setsalary(50000);
		emp.raiseSalary(20);
		//System.out.println(employee.toString());
		//System.out.println("The annual Salary of the employee is :"+ employee.getAnnualsalary());
		System.out.println(emp);

		Employee emp1= new Employee(02,"Abishek","Prian",2000);
		System.out.println(emp1.getAnnualsalary());

	}

}
