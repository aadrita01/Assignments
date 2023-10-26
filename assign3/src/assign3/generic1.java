package assign3;

import java.util.HashSet;

class Employee<T>
{
	private T id;
	private T name;
	private T sal;
	private T dep;
	public Employee(T id, T name, T sal, T dep) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.dep = dep;
	}
	public T getId() {
		return id;
	}
	public T getName() {
		return name;
	}
	public T getSal() {
		return sal;
	}
	public T getDep() {
		return dep;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", dep=" + dep + "]";
	}
}

public class generic1 {

	public static void main(String[] args) {
		HashSet <Employee<Object>> set=new HashSet<>();
	    set.add(new Employee<Object>(1,"Preeti",40000,"Accountant"));
	    set.add(new Employee<Object>(2,"Sumit",50000,"Designer"));
	    set.add(new Employee<Object>(3,"Radhika",60000,"Manager"));
	    
	    for(Object obj:set)
	    {
	    	System.out.println(obj);
	    }


	}

}
