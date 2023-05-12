package arryassiment18082022;

import java.util.Scanner;

public class ReverseArray {
	  public static void reverseArray(int size){
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
			System.out.println("print the array in reverse order");
			for(int i=size;i<=0;i--){
				System.out.println(array[i]);
			}
		  
	  }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		reverseArray(size);
	}

}
