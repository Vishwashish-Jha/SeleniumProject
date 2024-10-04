package Java_concepts.Java_basics;

public class sum_of_strings {

	public static void main(String[] args) {

	
	String str = "1,4,-5,2,-2,3,-3,-1";
	String arr1[]=new String[4];
	String arr2[]=new String[4];
	int count1=0,count2 =0;
	String op ="";
	
	String[] ch = str.split(",");
	
	for(String a:ch)
	{
		
		Integer no = Integer.parseInt(a);
		if(no<0)
		{
			arr1[count1]=a;
			count1++;
		
		}	
		else
		{
			arr2[count2]=a;
			count2++;
			}
	}
	
	for(String strop:arr1)
	{
		op +=strop+",";
	}
	for(String strop:arr2)
	{
		op +=strop+",";
	}
	System.out.println(op);
	
	}
}
