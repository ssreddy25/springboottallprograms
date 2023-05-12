package arryassiment18082022;

import java.util.Scanner;

public class OddPostitonArray {
	public static void oddPostitonArray(int size) {
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
		System.out.println("array element odd position ");
		for(int i=0;i<size;i++){
			if(array[i]%2!=0){
				System.out.println(i+"="+array[i]);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		oddPostitonArray(size);
	}

}
