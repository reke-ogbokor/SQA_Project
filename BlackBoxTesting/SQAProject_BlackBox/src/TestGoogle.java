public class TestGoogle {

	boolean verify01(boolean username, boolean password, boolean location, boolean user, boolean age) {

		if (username && password & location && user & age) {

			System.out.println("VALID. \n");

			return true;

		}

		else if (!username && password & location && user & age) {

			System.out.println("Your Password is Correct, however your username is not valid. \n");

			return false;

		} else if (username && !password & location && user & age) {

			System.out.println("INVALID. \n");

			return false;

		}

		else if (username && password & !location && user & age) {

			System.out.println("INVALID. \n");

			return false;

		}

		else if (username && password & location && !user & age) {

			System.out.println("INVALID. \n");

			return false;

		}

		else if (username && password & location && user & !age) {

			System.out.println("INVALID. \n");

			return false;

		}

		else {

			System.out.println("INVALID. \n");
			return false;

		}

	}

}
