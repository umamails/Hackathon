package com.training.sept;

public class Errorexample {

	public static void main(String[] args) {
		
			      recursiveMethod(10);
	}
			   public static void recursiveMethod(int i){
			      while(i!=0){
			         i=i+1;
			         recursiveMethod(i);
			      }
			   }
			

	}
