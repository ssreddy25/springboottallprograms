package stringproblems;

import java.util.Scanner;

public class RepatedString {

	public static long repetedCountOfString(String s, long n) {
		int len = s.length();

		long q = 0, r = 0;
		q = n / len;
		r = n % len;

		long partialStrLen = (r == 0) ? 0 : r;
		long count = q * getLetterCount(s, len) + getLetterCount(s, partialStrLen);

		return count;

	}

	public static long getLetterCount(String s,long n){
		
		long count=0;
		
		for(int i=0; i<n; i++){
			
			if(s.charAt(i) =='a'){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		System.out.println("enter the string ");
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		long n = sc.nextLong();

		long count = repetedCountOfString(s, n);

		System.out.println("count of the reated a character :" + count);

	}

}
