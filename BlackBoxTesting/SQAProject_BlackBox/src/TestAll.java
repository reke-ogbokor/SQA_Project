import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory({ Test02.class, Test01.class })
@SuiteClasses({ BlackBoxTest.class, VerificationTest.class })
public class TestAll {

}
