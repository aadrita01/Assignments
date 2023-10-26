package assign2;
import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;

public class collecQ2 {
	public static void main (String args[])
	{
	    ArrayList<Object> product=new ArrayList<>();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the names of 10 products");
	    for(int i=0;i<10;i++)
	    {
	    	product.add(sc.nextLine());
	    }
	   System.out.println(product);
	   
	   System.out.println("****************");
	   System.out.println("The final list of products is");
	   
	   HashSet<Object> hashset=new HashSet<Object>(product);
	   for(Object obj:hashset)
	   {
		   System.out.println(obj);
	   }
	    sc.close();
	}

}
