package arryassiment18082022;

import java.util.Scanner;

public class ArrayAssendingOrder {
	public static void arrayAssendingOrder(int size){
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
		int t;
		
		for(int i=0;i<size;i++){
			
			for(int j=0;j<size;j++){
				
				if(array[i]<=array[j]){
					t=array[i];
					array[i]=array[j];
					array[j]=t;
				
				}
				
			}
			}
		System.out.println("array in ascending order");
		for(int arr:array){
			System.out.println(arr);
			
		}
		}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		arrayAssendingOrder(size);
	}

}
