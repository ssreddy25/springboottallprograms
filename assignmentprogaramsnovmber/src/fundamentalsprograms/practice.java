package fundamentalsprograms;

class Calculator {

	public double findAverage(int number1,int number2,int number3){
		 double number4=number1;
		 double number5=number2;
		 double number6=number3;
		 double average=(number4+number5+number6)/3;
		 return average;
		}
}

public class practice {

	public static void main(String args[]) {
		int number1=12;
    	int number2=8;
    	int number3=15;

	Calculator calculator = new Calculator();
	double result=calculator.findAverage(number1,number2,number3);
	
   // System.out.format("average is: %.2f", result);  
   System.out.println(Math.round(result*100.0)/100.0);
	}
}

