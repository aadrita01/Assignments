package assign5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Q5 {
	static void insertNewPrice(Scanner sc,Path pfile,Path tfile)
	{
		int i=0;
		double total=0;
		String resp="yes";
		while(resp.equals("yes")) {
			++i;
		try {
			System.out.println("Insert price "+i+": ");
			double price=sc.nextDouble();
			total+=price;
			
			Files.writeString(pfile, Double.toString(price)+System.lineSeparator(), StandardOpenOption.APPEND);
			Files.writeString(tfile, Double.toString(total), StandardOpenOption.TRUNCATE_EXISTING);
			System.out.println("Price has been saved to the file.");
			System.out.println("Do you want to enter price for more items? (Yes/No)");
			resp=sc.next().toLowerCase();
			
		}catch(IOException e) {
			System.out.println("Error while writing the file.");
		}
		}
	}
	
	static void viewPurchaseTotal(Path tfile)
	{
		
		
		try {
			System.out.println(Files.readString(tfile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int option=0;
		Path pfile=Path.of("C:\\Users\\iot\\Desktop\\assignments\\prices.txt");
		
		Path tfile=Path.of("C:\\Users\\iot\\Desktop\\assignments\\total.txt");
		
		while(option!=3)
		{
			System.out.printf("Select your option\n1)Insert new price\n2)View purchase total\n3)Exit\n");
			option=sc.nextInt();		
			switch(option)
			{
			case 1:
				insertNewPrice(sc,pfile,tfile);
				break;
			case 2:
				viewPurchaseTotal(tfile);
				break;
			case 3:
				System.out.println("Exiting program...");
			    break;
			default:
				System.out.println("Invalid choice");   
			}
	    }

	}

}
