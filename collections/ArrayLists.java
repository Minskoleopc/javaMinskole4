package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//collection
		
		//list  (extends collection)
		
		//arrayList (implements list)
		
		
		// Java ArrayList Vs Array
		
		ArrayList<Integer>listA = new ArrayList<>();
		listA.add(12);
		listA.add(13);
		listA.add(14);
		listA.add(15);
		System.out.println(listA);
		
		// Array List of String 
		
		ArrayList<String>names  = new ArrayList<>();
		names.add("chinmay");
		names.add("sarika");
		names.add("poorva");
		names.add("sham");
		names.add("ram");
		System.out.println(names);
		
		
		// add the element 
		// retrive the element 
		
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(3));
		System.out.println(names.get(4));
		System.out.println(names.get(2));
		
		
		
		for(int i = 0 ; i < names.size() ; i++ ) {
			System.out.println(i);
			System.out.println(names.get(i));
		}
		
		// update the element 
		names.set(2, "komal");
		System.out.println(names.get(2));
		
		// updating the value at particular index
		
		names.remove(2);
		System.out.println(names);
		
		
		// Methods
		
		ArrayList<String>names2  = new ArrayList<>();
		names2.add("chinmay");
		names2.add("sarika");
		names2.add("poorva");
		names2.add("sham");
		names2.add("ram");
		
		
		// size()
		
		int aa = names2.size();
		System.out.println(aa);
		System.out.println(names2);
		
		// sort()
//		names2.sort(null);
//		System.out.println(names2);
		
		Collections.sort(names2);
		System.out.println(names2);
		
		// isEmpty()
		boolean b = names2.isEmpty();
		System.out.println(b);
		
		ArrayList<String>names3  = new ArrayList<>();
		boolean c = names3.isEmpty();
		System.out.println(c);
		
		names3.add("mayuri");
		names3.add("poorva");
		names3.add("sham");
		
		// indexOf()
		int ia = names3.indexOf("mayuri");
		System.out.println(ia);
		
		// contains()
		boolean ia2 = names3.contains("sham");
		System.out.println(ia2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
