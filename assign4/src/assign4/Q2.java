package assign4;

public class Q2 {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer();
		s.append("StringBuffer ");
		s.append("is a peer class of String ");
		s.append("that provides much of ");
		s.append("the functionality of strings.");
		System.out.println(s);
	
		StringBuffer s2=new StringBuffer("It is used to  at the specified index position.");
		s2.insert(14, "insert text");
		System.out.println(s2);
		
		StringBuffer s3=new StringBuffer("This method returns the reversed object on which it was called");
		s3.reverse();
		System.out.println(s3);
		}

}
