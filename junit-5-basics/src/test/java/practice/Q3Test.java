package practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q3Test {

	@Test
	void test() {
		Q3 ob=new Q3();
		assertThrows(InsufficientBalanceException.class,()->ob.withdraw(2000),"Withdraw amount is greater than balance");
	}

}
