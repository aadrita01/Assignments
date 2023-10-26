package assign1;

import java.util.Scanner;

public class divide {
		
	public void calc(int x, int y) 
	{
		try
		{
			System.out.println(x/y);
			}
		catch(Exception e)
		{
			System.out.println(e+" is found");
			System.out.println("the number is being divided by 0");
			throw new UnsupportedOperationException("Cannot divide by 0");
			
			}
		}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter x and y:");
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    divide obj = new divide();
	    obj.calc(x,y);
	    sc.close();
	}

}

