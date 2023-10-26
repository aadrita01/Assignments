package assign4;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute {
    int sequence() default 0;
}

public class annotation3 {
	@Execute(sequence=2)
	public void method1() {
		System.out.println("Method 1");
	}
	@Execute(sequence=1)
	public void method2() {
		System.out.println("Method 2");
	}
	@Execute(sequence=3)
	public void method3() {
		System.out.println("Method 3");
	}
	
	public static void main(String args[])
	{
		annotation3 ob=new annotation3();
		Method[] method=annotation3.class.getDeclaredMethods();
		List<Method> anno=new ArrayList<>();
		
		for(Method m:method) {
			if(m.isAnnotationPresent(Execute.class)) {
				anno.add(m);
			}
		}
		
		anno.sort(Comparator.comparingInt(m->m.getAnnotation(Execute.class).sequence()));
		
		for(Method m:anno) {
			try {
				m.invoke(ob);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
