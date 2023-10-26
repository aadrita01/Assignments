package assign5;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
	        var scanner = new Scanner(System.in);
	        
	        System.out.print("Enter principal amount: ");
	        var principal = scanner.nextDouble();
	        
	        System.out.print("Enter rate of interest: ");
	        var rate = scanner.nextDouble();
	        
	        System.out.print("Enter time (in years): ");
	        var time = scanner.nextDouble();
	        
	        var simpleInterest = (principal * rate * time) / 100;
	        
	        System.out.println("Simple Interest: " + simpleInterest);
	        
	        scanner.close();
	    }
	}


