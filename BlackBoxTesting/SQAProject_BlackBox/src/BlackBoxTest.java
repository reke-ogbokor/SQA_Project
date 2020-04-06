import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;
import java.util.regex.Pattern;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class BlackBoxTest {
	@Test
	@Category(Test01.class)

	public void TestSetup() {
		Scanner su = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		Scanner sa = new Scanner(System.in);
		Scanner sl = new Scanner(System.in);
		Scanner sp = new Scanner(System.in);
		Scanner so = new Scanner(System.in);
		Scanner sf = new Scanner(System.in);

		String user;
		String username;
		String location;
		String password;
		int age;

		System.out.print("Enter your Name:");

		user = su.nextLine();

		System.out.println(Pattern.matches("\\A\\D*\\Z", user));

		assertTrue(user.matches("\\A\\D*\\Z"));

		System.out.print("Enter your new Google username:");

		username = sc.nextLine();

		System.out.println(Pattern.matches("^[a-zA-Z0-9](\\.?[a-zA-Z0-9]){1,}", username));

		assertTrue(username.matches("^[a-zA-Z0-9](\\.?[a-zA-Z0-9]){1,}"));

		System.out.println("Your username is now " + username + "@gmail.com");

		System.out.print("Enter your Age:");

		age = sa.nextInt();

		if (age < 18) {

			System.out.print("false");

			assertThat(age, greaterThan(18));

		} else {

			System.out.println("true");

		}

		System.out.print("Enter your Location:");

		location = sl.nextLine();

		System.out.println(Pattern.matches("\\A\\D*\\Z", location));

		assertTrue(location.matches("\\A\\D*\\Z"));

		System.out.print("Enter your Password:");

		password = sp.nextLine();

		System.out.println(
				Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$!%^&+=])(?=\\S+$).{8,}$", password));

		assertTrue(password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$!%^&+=])(?=\\S+$).{8,}$"));

	}
}
