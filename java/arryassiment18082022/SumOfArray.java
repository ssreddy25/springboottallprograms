package arryassiment18082022;

import java.util.Scanner;

public class SumOfArray {
	
	public static void sumOfArray(int size) {
		Scanner sc = new Scanner(System.in);
		int[] array=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++){
			array[i]=sc.nextInt();
		}
		System.out.println("array elements are");
		for(int arr:array){
			System.out.println(arr);
			
		}
		
		int sum=0;
		for(int arr:array){
			sum+=arr;
			
		}
		System.out.println("sum of array is :"+sum);
		
		

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		sumOfArray(size); 

	}

}
