package fundamentalsprograms;

public class DiffOfDigits {
	
	
	public static int diffOfDigits(int number){
		int num=0;
		int num1=0;
		int sum=0;
		if(number<0){
			return sum=-3;
		}else if(number>99){
			
			return sum=-2;
			
		}else if(number>=0 && 9>=number){
			return sum=-1;
		}
		else if(number>=10 && 99>=number){
			
			num=number%10;
			num1=number/10;
			sum=num1-num;
			
			return sum;
			
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int num=83;
		
		System.out.println(diffOfDigits(num));
		
		
		

	}

}
