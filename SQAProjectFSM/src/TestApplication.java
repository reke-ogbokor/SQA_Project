
import java.util.Scanner;
import java.util.regex.Pattern;

public class TestApplication {


	
	Scanner su = new Scanner(System.in);
	Scanner sc = new Scanner(System.in);
	Scanner sa = new Scanner(System.in);
	Scanner sl = new Scanner(System.in);
	Scanner sp = new Scanner(System.in);
	Scanner so = new Scanner(System.in);
	Scanner sf = new Scanner(System.in);
	
	private static int home = 0;
	
	public static String user;
	public static String username;
	public static String location;
	public static String password;
	public static String answer;
	public static int age;

	public  int state;
	
	
	
	public TestApplication() {
		
		state = home;
	
	}
	
	public void home() {
		
		if (state == home) {
			
			System.out.println("Welcome to Google");
			
			System.out.println("Would you like to create an account? (Type 1 for yes, 0 for no)");
			
			state = so.nextInt(); //Retrieves user input
			
			
			
			if (state == 1) {
				
				state = 0;
				
				
				
			} else if (state == 0){
				
				System.out.println("Please Reload and Restart");
				
				System.exit(10);
			}
			
			
				
			
		}
		
		
	}
	
	public void Name() {
		
		if (state == 0) {
			
			System.out.println("User decides to Create An Account");
			
			System.out.println("Enter Name:");
			
			user = sc.nextLine(); //Retrieves user input
		
			if (Pattern.matches("\\A\\D*\\Z", user)) {
				
				state = 1;
				
			} else if (state == 0){
				
				System.out.println("Please enter a correct name and reload and restart");
			}
			
	}    
		
	}
	
	public void Username() {
		
		if (state == 1) {
			
			System.out.println("Enter Username:");
			
			username = su.nextLine();

			
			if (Pattern.matches("^[a-zA-Z0-9](\\.?[a-zA-Z0-9]){1,}", username)) {
				
				
				state = 2;
				
			}else  {
					
				System.out.println("Please enter a username with atleast 2 characters and reload and restart");
				}
					
		
	}
		
	}	
	
	
	public void Age() {
		
		if (state == 2) {
			
			System.out.println("Enter age:");
			
			age = sa.nextInt();
			
			
			if (age > 18) {
				
				
				state = 3;
					
				
			} else {
				
				System.out.println("Please make sure you are older than 18 and reload and restart");
				
				state = home;
				
			}
			
			
			
			
	}
		
		
		
		
	}
	
	
	
	public void Location() {
		
		if (state == 3) {
			
			System.out.println("Enter your Location:");
			
			location = sl.nextLine(); //Retrieves user input
			
			
			if (Pattern.matches("\\A\\D*\\Z", location)) {
				
				
				state = 4;
					
				
			} else {
				
				System.out.println("Please make sure you entered a valid location and reload and restart");
				
				state = home;
				
			}
			
			
			
			
	}
		
		
		
		
	}

//    At least 8 chars
//
//    Contains at least one digit
//
//    Contains at least one lower alpha char and one upper alpha char
//
//    Contains at least one char within a set of special chars (@#!%$^ etc.)
//
//    Does not contain space, tab, etc.

	
	public void Password() {
		
		if (state == 4) {
			
			System.out.println("Enter your Password:");
			
			password = sp.nextLine(); //Retrieves user input
			
			
			
			if (Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$!%^&+=])(?=\\S+$).{8,}$", password)) {
				
				
				state = 5;
					
				
			} else {
				
				
				
				System.out.println("Please make sure your password matches the criteria and reload and restart");
				
				state = home;
				
			}
			
			
			
			
	}
		
		
		
		
	}
	
	public void Final() {
		
		if (state == 5) {
			
			
			
			System.out.println("Your name is: " + user);
			
			System.out.println("Your username is: " + username +"@gmail.com");
			
			System.out.println("Your location is: " + location);
			
			System.out.println("Your age is: " + age);
			
			System.out.println("Your password is Valid");
			
			System.out.println("Press Enter to end your session");
			
			String finalA = sf.nextLine(); //Retrieves user input
			
			
			if (finalA.equals(""))
			System.exit(0);
			
	}
		
		
		
		
	}
	
}

