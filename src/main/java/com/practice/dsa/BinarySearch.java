package com.practice.dsa;

//program for binarySearch
public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[]= {3,4,12,34,78,90,120};
		int key=90;
		
		binarySearch(arr,key);
	}

	public static void binarySearch(int[] arr, int key) {
		
		int first=0;
		int last=arr.length-1;
		
		int mid=(first+last)/2;
		
		while(first<=last) {
			
			if(arr[mid] < key) {
				first=mid+1;
			} else if(arr[mid] == key){
				System.out.println("Element found at position:"+mid);
				break;
			} else {
				last=mid-1;
			}
			
			mid =(first+last)/2;
		}
		
		if(first>last) {
			System.out.println("Element not found!");
		}
		
	}

}
