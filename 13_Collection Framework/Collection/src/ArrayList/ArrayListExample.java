package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList()<String>();
		
		list.add("java");
		list.add("jdbc");
		list.add("servelet/jsp");
		list.add(2, "database");
		list.add("ibatis");
		
		int size = list.size();
		System.out.println(size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println(skill);
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + str);
			
		}
		System.out.println();
		
		}
		list.remove(2);
		list.remove(2);
		list.remove("ibatis");
	
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + str);
		}
	
}
