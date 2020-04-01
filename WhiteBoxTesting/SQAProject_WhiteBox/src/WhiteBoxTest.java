import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

import org.junit.Test;

public class WhiteBoxTest {
	private static int state;
	public static String user;
	public static String username;
	public static int age;
	public static String location;
	public static String password;

	@Test

	public void TestSetup() {

//		state = 1;
//		user = "Matt";
//		username = "mATT";
//		age = 16;
//		location = "Surrey";
//		password = "Matthew98!";

//	Comment these variables out to test out white box testing	

		if (state == 1) {

			state = 0;

		}

		if (state == 0 && Pattern.matches("\\A\\D*\\Z", user)) {

			assertTrue(user.matches("\\A\\D*\\Z"));

			state = 1;

		}

		if (state == 1 && Pattern.matches("^[a-zA-Z0-9](\\.?[a-zA-Z0-9]){1,}", username)) {

			assertTrue(username.matches("^[a-zA-Z0-9](\\.?[a-zA-Z0-9]){1,}"));

			state = 2;

		}

		if (state == 2 && age < 18) {

			assertThat(age, greaterThan(18));

			state = 3;

		}

		if (state == 3 && Pattern.matches("\\A\\D*\\Z", location)) {

			assertTrue(location.matches("\\A\\D*\\Z"));

			state = 4;

		}

		if (state == 4
				&& Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$!%^&+=])(?=\\S+$).{8,}$", password)) {

			assertTrue(password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$!%^&+=])(?=\\S+$).{8,}$"));

					}

	}

}
