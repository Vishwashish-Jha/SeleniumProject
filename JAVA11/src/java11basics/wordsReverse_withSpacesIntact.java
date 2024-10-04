package java11basics;

public class wordsReverse_withSpacesIntact {

	public static void main(String[] args) {

	
		String str = "My name is Vishwashish";
		String nstr = "";
		
		int len =str.length();
		System.out.println(len);
		
		for(int i=0,j=len-1 ;j>=0;i++,j--)
		{
			
			if(str.charAt(i)!=' ' && str.charAt(j)!=' ')
			{
				nstr += str.charAt(j);
			}
			
			else if(str.charAt(i)==' ')
			{
				nstr += " ";
				j++;
			}
			else if (str.charAt(j)==' ')
			{
				j--;
				nstr += str.charAt(j);
			}
			
			
		}
		System.out.println(nstr);
	
	
	
	}

}
