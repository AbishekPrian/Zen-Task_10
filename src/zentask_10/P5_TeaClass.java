package zentask_10;

public class P5_TeaClass {

	    // Method to prepare basic tea with hot water and tea leaves
	    public void prepareTea() {
	        System.out.println("Preparing tea with hot water and tea leaves...");
	    }

	    // Method to add milk to the tea
	    public void addMilk() {
	        System.out.println("Adding milk to the tea...");
	    }

	    // Method to add sugar to the tea
	    public void addSugar() {
	        System.out.println("Adding sugar to the tea...");
	    }

	    // Main method to demonstrate the functionality
	    public static void main(String[] args) {
	    	P5_TeaClass T1 = new P5_TeaClass();

	        T1.prepareTea(); // Prepare basic tea
	        T1.addMilk();    // Add milk to the tea
	        T1.addSugar();   // Add sugar to the tea
	    }
	}