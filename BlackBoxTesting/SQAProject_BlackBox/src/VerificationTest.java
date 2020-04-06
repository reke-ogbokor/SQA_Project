import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
@Category(Test02.class)

public class VerificationTest {

	private boolean test1;
	private boolean test2;
	private boolean test3;
	private boolean test4;
	private boolean test5;

	@Parameters
	public static Collection getParametersSlow() {
		return Arrays.asList(new Object[][] { { true, true, true, true, true }, { true, true, true, true, false },
				{ false, true, false, false, true }, { true, false, true, true, true } });

	}

	public VerificationTest(boolean test1, boolean test2, boolean test3, boolean test4, boolean test5) {

		this.test1 = test1;
		this.test2 = test2;
		this.test3 = test3;
		this.test4 = test4;
		this.test5 = test5;
	}

	@Test
	public void TestUser() {

		TestGoogle testverify01 = new TestGoogle();

		assertEquals(true, testverify01.verify01(test1, test2, test3, test4, test5));

	}

}