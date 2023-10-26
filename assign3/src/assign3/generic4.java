package assign3;
import java.util.Date;

class Pair<K,V>
{
	private K key;
	private V value;
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	public void setValue(V value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "pair [key=" + key + ", value=" + value + "]";
	}
}

public class generic4 {
	public static void main(String args[])
	{
		Pair<String,String> pair1=new Pair<String,String>(null, null);
		pair1.setKey("1");
		pair1.setValue("Hello");
		System.out.println(pair1.getKey()+" "+pair1.getValue());
		
		Pair<String,Date> pair2=new Pair<String,Date>(null, null);
		pair2.setKey("Today is");
		pair2.setValue(new Date());
		System.out.println(pair2.getKey()+" "+pair2.getValue());
	}

}
