package com.vp.ds.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintMap {

	
	public static void main(String[] args) {
	
		// input  - 0,1,2,3,2,0,2,3,2,5,9,19
		// out put - 0-2, 1-1,2-3
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer> ();
		List<Integer> arrayList= new ArrayList<Integer>();
		arrayList.add(10);arrayList.add(8);arrayList.add(0);
		arrayList.add(10);arrayList.add(9);arrayList.add(10);
		
		arrayList.add(0);arrayList.add(1);arrayList.add(2);arrayList.add(3);
		arrayList.add(0);arrayList.add(2);arrayList.add(3);arrayList.add(2);
		arrayList.add(1);arrayList.add(2);arrayList.add(3);arrayList.add(10);
		
		
		
		
		System.out.println("arraylist \n" + arrayList);
		for(Integer i: arrayList)
		{ 
			if(hashMap.get(i) !=null)
			{
				hashMap.put(i,(hashMap.get(i) +1) );
			}else
			{
				hashMap.put(i, 1);
			}
			
			
		}
		
		Set<Integer> keys= hashMap.keySet();
		
		Iterator<Integer> iterator = keys.iterator();
		while(iterator.hasNext())
		{
			Integer key = (Integer) iterator.next();
			Integer value = hashMap.get(key);
			System.out.println(key +"->" + value);	
		}
		
		
	}

}
