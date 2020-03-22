//This is a test that checks if the users email belongs to google or not.
//Enter input to check the test

import static org.junit.Assert.assertTrue;

import java.util.Scanner;
import java.util.regex.Pattern;
import org.junit.Test;


public class TestUser {
@Test
	
public void testSetup() {
	
	System.out.print("Enter your new Google username:");
	
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in); 
	 
    String gmail = sc.nextLine(); //Retrieves user input
   
    
	System.out.println(Pattern.matches("^[a-zA-Z0-9](\\.?[a-zA-Z0-9]){1,}@g(oogle)?mail\\.com$", gmail)); //Checks if email ends with gmail.com using REGEX.
	
	
	assertTrue(gmail.matches("^[a-zA-Z0-9](\\.?[a-zA-Z0-9]){1,}@g(oogle)?mail\\.com$")); //JUnit checks if email ends with gmail.com using REGEX.
	
 }
	
	
	
}
