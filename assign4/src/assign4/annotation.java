package assign4;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)
	@interface Test {
	}
	
public class annotation{
	@Test
	void testCase()
	{
		System.out.println("Inside test case method");
	}
	public static void main(String args[])
	{
		annotation ob=new annotation();
		ob.testCase();
	}
}


