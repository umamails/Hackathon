package com.training.sept;

import java.util.Iterator;
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// example to create arraylist and to find arraylist size
	
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(5);
		arrayList.add(4);
		arrayList.add(3);
		arrayList.add(2);
		arrayList.add(1);
		System.out.println(arrayList.size());
	}
}
		// example for heterogeneous elements and built in data
		
		/*ArrayList arrayList = new ArrayList<>();
		arrayList.add(5);
		arrayList.add(44.0);
		arrayList.add("Aru");
		arrayList.add(22.0);
		arrayList.add("Testing");
		System.out.println(arrayList.size());
		System.out.println(arrayList.get(2));
		System.out.println(arrayList.contains(22.0));*/
		// we need a loop to reterive the data
		// example for : for loop
		
	/*	ArrayList arrayList = new ArrayList<>();
		arrayList.add(5);
		arrayList.add(44.0);
		arrayList.add("Aru");
		arrayList.add(22.0);
		arrayList.add("Testing");
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
					
		}
				
	}

}*/

// Example for Iterator

	/*	ArrayList arrayList = new ArrayList<>();
		arrayList.add(5);
		arrayList.add(44.0);
		arrayList.add("Aru");
		arrayList.add(22.0);
		arrayList.add("Testing");
Iterator itr=arrayList.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());*/
