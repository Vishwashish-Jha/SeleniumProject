package MavenProject.DemoProject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayToList {

	public static void main(String[] args) {

	
	String[] str = {"ABC","DEF","GHI"};
	
	for(String tstr:str)
	{
		//reversing each object code
	}
	
	List<String> ls = Arrays.asList(str);
	
	Collections.reverse(ls);
	
	System.out.println(ls);
	
	
	
	
	}

}
