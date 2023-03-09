package com.training.sept;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
tm.put(70, "Dancy");
tm.put(34, "Devi");
tm.put(56, "kalphana");
tm.put(40, "Sudha");
tm.put(69, "Yadhu");
tm.put(69, "Nila");
tm.put(22,"Babu");
tm.put(22, "null");
for(Map.Entry treemapdisplay:tm.entrySet()) {
	System.out.println(treemapdisplay.getKey()+" "+treemapdisplay.getValue());
	}

}
}