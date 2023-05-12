package comarble;

import java.util.Arrays;

class Docter implements Comparable<Docter>{
	public String dId;
	public String dName;
	public String dSpelist;
	public Docter(String dId, String dName, String dSpelist) {
		
		this.dId = dId;
		this.dName = dName;
		this.dSpelist = dSpelist;
	}
	@Override
	public String toString() {
		return "Docter [dId=" + dId + ", dName=" + dName + ", dSpelist=" + dSpelist + "]";
	}

	public int compareTo(Docter d ) {
		
		return dSpelist.compareTo(d.dSpelist);
	}
	
}

public class SortingComparble {

	public static void main(String[] args) {
		Docter[] docter=new Docter[5];
		 docter[0]=new Docter("102c","D.r siva","cordiyalgi"); 
		 docter[1]=new Docter("103e","D.r reddy","eye spelist"); 
		 docter[2]=new Docter("104D","D.r sankar","dermatalagi"); 
		 docter[3]=new Docter("105g","D.r radha","gynokalgi"); 
		 docter[4]=new Docter("106a","D.r rao","arho");
		 System.out.println("before sorting");
		 for(Docter d: docter){
			 System.out.println(d);
		 }
		 System.out.println("after sorting");
		 Arrays.sort(docter);
		 for(Docter e: docter){
			 System.out.println(e);
		 }
		 
		 
		 
		 
	   
	}

}
