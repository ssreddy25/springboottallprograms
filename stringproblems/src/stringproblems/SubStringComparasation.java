package stringproblems;

import java.util.Scanner;

public class SubStringComparasation {
	
	  
	public static String comparesationString(String s, int n){
		
		String str=s.substring(0,n);
		String smallest=str;
		String largest=str;
		
		for(int i=1; i<=s.length()-n;i++){
			
			str=s.substring(i ,i+n);
			if(str.compareTo(smallest)<0){
				smallest=str;	
			}
			if(str.compareTo(largest)>0){
				largest=str;	
			}
		}
		return smallest +"\n"+largest;
	}

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		
		String s=sc.next();
		System.out.println("enter the substring length");
		
		int n=sc.nextInt();
		
		String out=comparesationString(s,n);
		
		System.out.println(out);

	}

}
