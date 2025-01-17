package selenium_selfstudy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Multiplewindow {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<String>();
		set.add("aa");
		set.add("bb");
		set.add("CC");
		System.out.println(set);
		
		List<String> list=new ArrayList<String>(set);
		System.out.println(list);
		
		

	}

}
