package s;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEg {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("Sugi");
		lhs.add("Mongodb");
		lhs.add("Java");
		lhs.add("Rajsh");
		
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
