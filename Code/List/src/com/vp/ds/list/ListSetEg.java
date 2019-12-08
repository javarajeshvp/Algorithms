package com.vp.ds.list;

import java.util.*;

public class ListSetEg {

    public static void main(String arg[]) {
        System.out.println("Hello");

        String ar[] = {"k", "a", "b", "a", null, "c", "c", "f", "h", "a", null};
        List<String> arrayList = new ArrayList<String>();
        List<String> linkedList = new LinkedList<String>();
        List<String> stack = new Stack<String>();


        Set<String> hashSet = new HashSet<String>();
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        Set<String> treeSet = new TreeSet<String>(arrayList);

        for (int i = 0; i < ar.length; i++)

        {
            arrayList.add(ar[i]);
            linkedList.add(ar[i]);
            stack.add(ar[i]);

            hashSet.add(ar[i]);
            linkedHashSet.add(ar[i]);
            //  treeSet.add(ar[i]);
        }

        System.out.println("arrayList : " + arrayList); // Accepts null, Allows Duplicates, maintains insertion order, Insert/Remove O(n), Retrieval Random Access O(1),
        System.out.println("linkedList : " + linkedList); // Accepts null, Allows Duplicates, maintains insertion order , Insert/RemoveO(1), Retrieval O(n)
        System.out.println("stack : " + stack);

        System.out.println("hashSet : " + hashSet); // Accepts null, No  duplicates, No Random Access, do not maintain insertion order, sorted as per the order of HashCode,
        System.out.println("linkedHashSet : " + linkedHashSet); // Accept null, No duplicates, No Random Access, maintains insertion order
        System.out.println("treeSet : " + treeSet); // Do not accept null, No duplicates, No Random Access, sorted based on the supplied comparator (Asc default)
    }

}
