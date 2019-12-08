package s;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetEg {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Mongodb");
		hs.add("Sugi");
		hs.add("Java");
		hs.add("Rajsh");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
