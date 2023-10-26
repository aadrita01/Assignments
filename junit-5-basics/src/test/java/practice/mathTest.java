package practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class mathTest {
	math ob;
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("This will print before all");
	}
	
	@BeforeEach
	void init() {
		ob=new math();
	}
	
	@AfterEach
	void cleanup()
	{
		System.out.println("Cleaning up...");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("Testing Ended");
	}

	@Test
	void testAdd() {
		int exp=3;
		int act=ob.add(1,2);
		assertEquals(exp, act);
	}
	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, ()->ob.divide(1,0));
	}

}
