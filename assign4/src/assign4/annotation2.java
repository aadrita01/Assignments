package assign4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@interface Info {
    String authorID();    // Mandatory
    String author() default "";  // Optional
    String supervisor() default "";  // Optional
    String date();    // Mandatory
    String time();    // Mandatory
    int version();    // Mandatory
    String description() default "";  // Optional
}

public class annotation2 {
    @Info(
		authorID="789",
		date="2023-10-17",
		time="15:30",
		version=3,
		description="this is a sample method"
	)
	public void myMethod() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Method m=annotation2.class.getDeclaredMethod("myMethod");
			Info minfo=m.getAnnotation(Info.class);
			System.out.println("Method Author ID: " + minfo.authorID());
            System.out.println("Method Date: " + minfo.date());
            System.out.println("Method Time: " + minfo.time());
            System.out.println("Method Version: " + minfo.version());
            System.out.println("Method Description: " + minfo.description());
			
		}catch(NoSuchMethodException e) {
			e.printStackTrace();
		}
		
		
	
	}

}
