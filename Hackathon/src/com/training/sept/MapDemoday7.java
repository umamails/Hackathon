package com.training.sept;

import java.util.HashMap;

public class MapDemoday7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Dancy");
		hm.put(2, "Devi");
		hm.put(3, "kalphana");
		hm.put(4, "Sudha");
		hm.put(6, "Yadhu");
		hm.put(6, "Nila");
		hm.put(null,"Babu");
		hm.put(null, "Prabu");
		System.out.println(hm.size());
		System.out.println(hm.get(null));	
		for (String values:hm.values()){
			System.out.println(values);
		}
		for (Integer keys: hm.keySet()) {
			System.out.println(keys);
		}
	}

}
