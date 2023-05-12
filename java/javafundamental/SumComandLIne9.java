package javafundamental;
/**
 *  
 * @author su22034
 *9. Accept the number from command line and calculate sum of digits.
 */
public class SumComandLIne9 {

	public static void main(String[] args) {
		int sum=0;
		int number= Integer.parseInt(args[0]);
		int number1= Integer.parseInt(args[1]);
		int number2= Integer.parseInt(args[2]);
		sum=sum+number+number1+ number2;
		System.out.println("using comand line  arguments print the sum of digits:"+sum);
		
		 
		 

	}

}
