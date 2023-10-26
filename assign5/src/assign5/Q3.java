package assign5;
import java.util.List;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sent="A quick brown fox jumps over the lazy dog";
		List<String> list=List.of(sent.split(" "));
		
		String[] arr=list.toArray((size)->new String[size]);
		for(String s:arr)
		{
			System.out.print(s+" ");
		}

	}

}
