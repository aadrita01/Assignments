package assign2;
import java.time.LocalDate;
import java.time.Year;
import java.util.LinkedList;

public class collecQ4 {

	public static void main(String[] args) {
		collecQ4 obj=new collecQ4();
		
	    LinkedList<Object> date=new LinkedList<Object>();
	    date.add(LocalDate.of(2000,12,25));
	    date.add(LocalDate.of(2003,9,12));
	    date.add(LocalDate.of(2012,4,05));
	    date.add(LocalDate.of(2006,2,19));
	    
	    obj.display(date);
	}
	
	boolean leapYear(Object dob) {
		LocalDate date=(LocalDate)dob;
		int year=date.getYear();
		if(Year.of(year).isLeap())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	void display(LinkedList<Object> date)
	{
		for(Object dob:date)
		{
			if(leapYear(dob)==true) {
				System.out.println("Your date of birth is "+dob+" and it was a leap year");
			}
			else
			{
				System.out.println("Your date of birth is "+dob+" and it was not a leap year");
			}
		}
	}
}
