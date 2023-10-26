package assign3;

public class generic3 {
	public<T> void exchange(T arr[],int i1,int i2)
	{
		T e=arr[i1];
		arr[i1]=arr[i2];
		arr[i2]=e;
	}
	
	public static void main(String args[])
	{
		generic3 obj=new generic3();
		Integer arr[]= {1,2,3,4,5,6,7,8,9};
		obj.exchange(arr,1,3);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
