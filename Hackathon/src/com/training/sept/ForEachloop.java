package com.training.sept;

import java.util.ArrayList;

public class ForEachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Narayan");
		arrayList.add("Jyothi");
		arrayList.add("Jnanesh");
		arrayList.add("Kokila");
		arrayList.add("Ruchi");
		arrayList.add("Testing");
		arrayList.add(null);
		arrayList.add(3,"Baljit");
		for(String name:arrayList) // u can give ame or a or b etc..
			System.out.println(name);

	}

}
