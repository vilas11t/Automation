package seleniumPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ForEachLoopPractice {
	
	public static void main(String[] args) {
		Set<String> s=new LinkedHashSet<String>();
		
		s.add("Swapnil");
		s.add("santosh");
		s.add("Sandip");
		s.add("ajay");
		
		for(String str:s) {
			
			System.out.println(str);
			
		}
		
	}

}
