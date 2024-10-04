package java11basics;

public class StringInsideString {

	public static void main(String[] args) {

	String str = "hare ram hare ram ramram HareHare";
	int count =0;
	String[] word = str.split(" ");
	
	for(String s : word)
	{
		System.out.println(s);
		int len =s.length();
		System.out.println();
		String temp = "";
		
		if(s.equalsIgnoreCase("hare"))
		{
			count++;
		}
		else 
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<=len;j++)
			{
				temp =	s.substring(i,j);
				System.out.println(temp);				
				if(temp.equalsIgnoreCase("hare"))
				{
					count++;
				}
			}
			
		}		
	}
	
	System.out.println(count);
	
		
	}

}
