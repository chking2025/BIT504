import java.util.Scanner;
public class WelcomeUser {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println ("Welcome user!");

		System.out.println("\nPlease enter your first name: ");
		String firstName = scanner.next();
		
		System.out.println("\nPlease enter your last name: ");
		String lastName = scanner.next();
	
		System.out.println("\nPlease enter your age: ");
		int age = scanner.nextInt();
	
		System.out.println("\nPlease enter your favourite number: ");
		int favNum = scanner.nextInt();
	
System.out.println("\nHello, " + firstName + " " + lastName +"." +"\nYou are " + age + " " + "years old."
+ "\nYour favourite number is " + favNum + ".");	
	
	
	
	} // end of Main

} // end of Class
