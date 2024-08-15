package zentask_10;

public class Person {

	//Attributes declaration
	private int age;
	private String name;
	
	//Empty constructor
	Person(){
		System.out.println("Empty Constructor Display\n");
	}
	
	//Parameterized Constructor
	Person(int a , String b){
		 age = a;
		 name=b;
	}
	
	//Getter method for Name
	public String getName() {
		return name;	
	}
	
	//Getter method for Age
		public int getAge() {
			return age;
		}
	
	//Main method 
	public static void main(String[] args) {
	
	//Empty constructor calling
	Person Emp = new Person();
		
		
	//Parameterized constructor calling
	Person obj = new Person(29,"Abishek");
	
	System.out.println("Name and Age display using object and variables");
	System.out.println("\nName: "+obj.name);
	System.out.println("Age: "+obj.age);
	
	System.out.println("\nName and Age display using object and getter methods");
	System.out.println("\nName : "+ obj.getName());
	System.out.println("Age : "+ obj.getAge());
	
	}
}

/* sample output
 
Empty Constructor Display

Name and Age display using object and variables

Name: Abishek
Age: 29

Name and Age display using object and getter methods

Name : Abishek
Age : 29

*/