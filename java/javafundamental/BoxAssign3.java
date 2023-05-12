package javafundamental;

/**
 * 
 * @author su22034 3. Create a box class having instance variables width and
 *         height and havingvarious instance methods with and without arguments
 *         and performing variousoperations on it. It must have default and
 *         parameterized constructors too. Usethis variable in the constructors
 *         and perform garbage collection using finalize()method.
 *
 *
 */
public class BoxAssign3 {
	public double width;
	public double height;
	public double length;
	
	public BoxAssign3(){
		System.out.println("this a default counster");
	}
	
	//Parameterized constructor
	public BoxAssign3(double width, double height, double length) {
		
		this.width = width;
		this.height = height;
		this.length = length;
	}


	public void box(){
		//without parameter method
		System.out.println("box volume is a :"+this.width*this.height*this.length);
	}
	
	public void box(double width,double height,double length){
		System.out.println("box volume is a ");
		System.out.println(this.width*this.height*this.length);
		
	}

	public static void main(String[] args) {
	    
		BoxAssign3 bx=new BoxAssign3();
		bx.height=10;
		bx.length=5;
		bx.width=15;
		BoxAssign3 bx1=new BoxAssign3(15.0,20.0,10.0);
		//without arguments
		bx.box();
		bx1.box(20, 18, 10);
		try {
			bx1.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
