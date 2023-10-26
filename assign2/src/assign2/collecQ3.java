package assign2;

import java.util.*;

class Employee
{
	private int id;
	private String name;
	private String dep;
	private int sal;
	
	public Employee(int id, String name, String dep, int sal) {
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDep() {
		return dep;
	}

	public int getSal() {
		return sal;
	}
}

class idcomp implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		return e1.getId()-e2.getId();
	}
}

class namecomp implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		return e1.getName().compareTo(e2.getName());
	}
}

class depcomp implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		return e1.getDep().compareTo(e2.getDep());
	}
}

class salcomp implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		return e1.getSal()-e2.getSal();
	}
}


public class collecQ3 {
	
	void print(Comparator<Employee> x) {
		TreeSet<Employee> set=new TreeSet<Employee>(x);
		set.add(new Employee(1, "Suraj", "Engineer1", 40000) );
		set.add(new Employee(2, "Meghna", "Accountant1", 30000) );
		set.add(new Employee(3, "Preeti", "Engineer2", 50000) );
		set.add(new Employee(4, "Arnab", "Designer", 45000) );
		set.add(new Employee(5, "Shruti", "Accountant2", 60000) );
		set.add(new Employee(6, "Poonam", "Manager", 90000) );
		set.add(new Employee(7, "Rita", "Engineer3", 70000) );
		set.add(new Employee(8 , "Sourabh", "Support", 35000) );
		set.add(new Employee(9 , "Rounak", "Engineer4", 550000) );
		set.add(new Employee(10, "Neha", "HR", 650000) );
	
		for(Employee e:set)
		{
			System.out.println("ID:"+e.getId()+" Name:"+e.getName()+" Department:"+e.getDep()+" Salary:"+e.getSal());
		}
		
	}

	public static void main(String[] args) {
		collecQ3 obj=new collecQ3();
		Scanner sc= new Scanner(System.in);
		char choice;
		System.out.printf("Sort by?%na)ID%nb)Name%nc)Department%nd)Salary%n");
		choice=sc.next().charAt(0);		
		
		switch(choice)
		{
		case 'a':
			obj.print(new idcomp());
			break;
		case 'b':
			obj.print(new namecomp());
			break;
		case 'c':
			obj.print(new depcomp());
			break;
		case 'd':
			obj.print(new salcomp());
			break;
		default:
			System.out.println("Invalid Choice");
		}
	    sc.close();

	}

}
