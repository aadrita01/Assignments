package assign4;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World";
		System.out.println(str.length());
		
		String a="Hello,";
		String b="How are you?";
		System.out.println(a.concat(b));
		
		String x="Java String pool refers to collection of Strings which are stored in heap memory";
        System.out.println("String in lowercase:"+x.toLowerCase());
        System.out.println("String in Uppercase:"+x.toUpperCase());
        System.out.println("Replace a with $:"+x.replace("a","$"));
        System.out.println("Contains collection?:"+x.contains("collection"));
        System.out.println("Equals?:"+x.equals("java string pool refers to collection of strings which are stored in heap memory"));
        System.out.println("Equals ignore case?:"+x.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory"));
                
        
	}

}
