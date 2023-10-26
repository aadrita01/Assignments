package assign3;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class generic2 {
	public static void main(String args[])
	{
		Map<Integer,Double> map=new HashMap<>();
		Random rand=new Random();
		for(int i=0;i<10;i++) {
			int key=rand.nextInt(100);
			double value=rand.nextDouble(1,100);
			map.put(key,value);
		}
		
		for(Map.Entry<Integer,Double> entry:map.entrySet())
		{
			System.out.println("Key:"+entry.getKey()+" Value:"+entry.getValue());
		}
	}

}
