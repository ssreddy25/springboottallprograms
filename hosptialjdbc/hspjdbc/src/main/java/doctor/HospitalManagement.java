package doctor;

import java.sql.SQLException;
import java.util.Scanner;
import doctor.HospitalMainProgram;
public class HospitalManagement extends  DoctorDaoImplements {
	
	public static Scanner sc= new Scanner(System.in);
	 static HospitalManagement hospitalManagement=new HospitalManagement();
	
	public void admin() throws SQLException{
		System.out.println("*******************************");
		System.out.println("1.Add doctor                  *");
		System.out.println("2.View doctor                 *");
		System.out.println("3.View All doctor             *");
		System.out.println("4.Delete doctor               *");
		System.out.println("5.Upadte doctor               *");
		System.out.println("6.back to main method         *");
		System.out.println("*******************************");
		System.out.println("select  you above choice one of these ");
		
		int choice=sc.nextInt();
		switch(choice){
		case 1:
			hospitalManagement.addDoctor();
			admin();
			break;
			
			
		case 2:
			System.out.println("enter the doctor id");
			String doctorId=sc.next();
			hospitalManagement.viewDoctor(doctorId);
			admin();
			break;
			
		case 3:
			hospitalManagement.viewAllDoctor();
			admin();
			break;
		case 4:
			System.out.println("enter the doctor id");
			String doctorId1=sc.next();
			hospitalManagement.deleteDoctor(doctorId1);
			admin();
			break;
		case 5:
			System.out.println("enter the doctor id");
			String doctorId2=sc.next();
			hospitalManagement.update(doctorId2);
			admin();
			break;
		case 6:
			HospitalMainProgram.main(null);
			break;
			
			default:
				System.out.println("you enter the wrong choice");
				admin();
				
			
		}
	}
	
	public void paitent() throws SQLException{
		System.out.println("*******************************");
		System.out.println("1.View All doctor             *");
		System.out.println("2.View doctor                 *");
		System.out.println("3.take a apoientment          *");
		System.out.println("4.back to main method         *");
		System.out.println("*******************************");
		System.out.println("select  you above choice one of these ");
		
		int choice=sc.nextInt();
		switch(choice){
		case 1:
			hospitalManagement.viewAllDoctor();
			paitent();
			break;
			
			
		case 2:
			System.out.println("enter the doctor id");
			String doctorId=sc.next();
			hospitalManagement.viewDoctor(doctorId);
			
			paitent();
			break;
			
		case 3:
			System.out.println("enter the doctor id");
			String doctorId1=sc.next();
			hospitalManagement.appiontment(doctorId1);
			paitent();
			break;
		case 4:
			
			HospitalMainProgram.main(null);
			break;
			
			default:
				System.out.println("you enter the wrong choice");
				paitent();
				
			
		}
	}
	
	
	

}
