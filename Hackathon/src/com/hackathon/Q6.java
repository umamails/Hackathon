package com.hackathon;

public class Q6 {

	public static void main(String[] args) {
		//WJP to perform ascending order Selection  sort
		int[] arr= {9,2,7,1};
		int min,temp;
		for(int i=0;i<arr.length;i++) {
			min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					min=j;
					temp=arr[i];
					arr[i]=arr[min];
					arr[min]=temp;
				}
			}
		}
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]+" ");
				}
			}
		}

	


