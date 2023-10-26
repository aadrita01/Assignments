package assign2;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

class contact{
	long phno;
	String name;
	String email;
	gender g;
	public contact(long phno, String name, String email, gender g) {
		this.phno = phno;
		this.name = name;
		this.email = email;
		this.g = g;
	}
	public long getPhno() {
		return phno;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public gender getG() {
		return g;
	}
	@Override
	public String toString() {
		return "contact [phno=" + phno + ", name=" + name + ", email=" + email + ", g=" + g + "]";
	}
	
}

public class collecQ1 {
	public static void main(String args[])
	{
		Map<Long,contact> con=new TreeMap<>(Collections.reverseOrder());
		
		con.put(23569l, new contact(23569,"Preeti","preeti@yahoo.com",gender.Female));
		con.put(14587l, new contact(14587,"Anshi","anshi@yahoo.com",gender.Female));
		con.put(25698l, new contact(25698,"Sudhir","sudhir@yahoo.com",gender.Male));
		con.put(95421l, new contact(95421,"Mayra","mayra@yahoo.com",gender.Female));
		con.put(24872l, new contact(24872,"Riki","riki@yahoo.com",gender.Male));
		
		for(Map.Entry<Long,contact> entry:con.entrySet())
		{
			System.out.println("Key:"+entry.getKey());
		}
		for(Map.Entry<Long,contact> entry:con.entrySet())
		{
			System.out.println("Value:"+entry.getValue());
		}
		for(Map.Entry<Long,contact> entry:con.entrySet())
		{
			System.out.println(entry);
		}
	}

}
