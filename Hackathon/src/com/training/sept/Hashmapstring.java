package com.training.sept;

import java.util.HashMap;
import java.util.Map;

public class Hashmapstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("*", "Dancy");
		hm.put("#", "Devi");
		hm.put("TRAIN", "kalphana");
		hm.put("TEST", "Sudha");
		hm.put("69", "Yadhu");
		hm.put("null", "Nila");
		hm.put("69", "Babu");
		hm.put("123*", "Prabu");
		hm.put("null", "Sahana");
		System.out.println(hm.get("#"));
		System.out.println(hm.containsValue("nila"));
		System.out.println(hm.containsKey("69"));
		// display both key and values
		
		for (Map.Entry hashmapdisplay:hm.entrySet()){
			System.out.println(hashmapdisplay.getKey()+ " "+hashmapdisplay.getValue());
		}
	}

}
