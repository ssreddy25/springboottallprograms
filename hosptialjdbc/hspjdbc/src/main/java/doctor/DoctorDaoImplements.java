package doctor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DoctorDaoImplements implements DoctorDao {
	public static Scanner sc = new Scanner(System.in);

	static String url = ("jdbc:mysql://localhost:3306?user=root&password=root");
	static String qury1 = ("Select * from hospital.doctor");
	static String qury2 = ("Select * from hospital.doctor where doctorID=?");
	static String query3 = ("delete  from hospital.doctor where doctorID=?");
	static String update1 = ("update hospital.doctor set doctorID=? where doctorID=?");
	static String update2 = ("update hospital.doctor set doctorName=? where doctorID=?");
	static String update3 = ("update hospital.doctor set doctorSpecilist=? where doctorID=?");
	static String update4 = ("update hospital.doctor set doctorFees=? where doctorID=?");
	static String update5 = ("update hospital.doctor set doctorSalary=? where doctorID=?");
//	static String pqueryI=("insert into hospital.patient values(?,?,?,?,?,?)");

	public void addDoctor() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");

		PreparedStatement ps = con.prepareStatement("insert into hospital.doctor values(?,?,?,?,?)");
		PreparedStatement psSelect = con.prepareStatement("Select * from hospital.doctor");
		PreparedStatement psSelectBId = con.prepareStatement("Select * from hospital.doctor where doctorID=?");

		int n = 1;
		while (n == 1) {
			System.out.println("enter the doctor id");
			String doctorid = sc.next();
			// ps.setString(1, doctorid );

			while (!Pattern.matches("[0-9]{4}", doctorid)) {
				System.err.println("Please enter Doctor ID must be 4 digit");
				doctorid = sc.next();

			}

			ps.setLong(1, (Integer.parseInt(doctorid)));

			System.out.println("enter the doctor name");

			String doctorName = sc.next();
			ps.setString(2, doctorName);

			// String doctorName = sc.next();
			//
			// while (!Pattern.matches("[A-Z][a-z]*", doctorName)) {
			// System.err.println("Please enter Doctors Name First Letter
			// Capitals");
			//
			// ps.setString(2, doctorName);
			//
			//
			// }
			System.out.println("enter the doctorSpesilist ");

			String doctorSpesilist = sc.next();
			ps.setString(3, doctorSpesilist);
			// while (!Pattern.matches("[A-Z][a-z]*", doctorSpesilist)) {
			// System.err.println("Please enter doctorSpesilist First Letter
			// Capitals");
			// ps.setString(3, doctorSpesilist);
			//
			// }
			System.out.println("enter the doctor fees");

			String doctorFess = sc.next();
			ps.setString(4, doctorFess);
			System.out.println("enter the doctor salary");
			String doctorSalary = sc.next();
			ps.setString(5, doctorSalary);

			int i = ps.executeUpdate();
			System.out.println(i + " data added");
			System.out.println("do you want to add one more doctor plase enter the 1 other wise press any key");
			n = sc.nextInt();

		}
		System.out.println("Successfully Doctors added....");

	}

	public void viewDoctor(String doctorId) throws SQLException {
		Connection con = DriverManager.getConnection(url);
		PreparedStatement psSelectBId = con.prepareStatement(qury2);

		psSelectBId.setString(1, doctorId);

		ResultSet rs = psSelectBId.executeQuery();

		System.out.println(
				"did" + "  " + "doctorName  " + "  " + " doctorSpecilist " + " doctorFees " + "  " + "doctorSalary ");
		while (rs.next()) {
			String dId = rs.getString("doctorID");
			String doctorName = rs.getString("doctorName");
			String doctorSpecilist = rs.getString("doctorSpecilist");
			String doctorFees = rs.getString("doctorFees");
			String doctorSalary = rs.getString("doctorSalary");

			System.out.println(
					dId + "  " + doctorName + "  " + doctorSpecilist + "  " + doctorFees + "  " + doctorSalary);

		}

	}

	public void deleteDoctor(String doctorId) {
		Connection con;
		try {
			con = DriverManager.getConnection(url);

			PreparedStatement psSelectD = con.prepareStatement(query3);

			psSelectD.setString(1, doctorId);
			psSelectD.executeUpdate();
			System.out.println("data deleted");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void viewAllDoctor() throws SQLException {
		Connection con = DriverManager.getConnection(url);

		PreparedStatement psSelect = con.prepareStatement(qury1);

		ResultSet rs = psSelect.executeQuery();
		System.out.println(
				"did" + "  " + "doctorName  " + "  " + " doctorSpecilist " + " doctorFees " + "  " + "doctorSalary ");
		while (rs.next()) {
			String dId = rs.getString("doctorID");
			String doctorName = rs.getString("doctorName");
			String doctorSpecilist = rs.getString("doctorSpecilist");
			String doctorFees = rs.getString("doctorFees");
			String doctorSalary = rs.getString("doctorSalary");

			System.out.println(
					dId + "  " + doctorName + "  " + doctorSpecilist + "  " + doctorFees + "  " + doctorSalary);

		}

	}

	public void appiontment(String doctorId) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");

		PreparedStatement ps = con.prepareStatement("insert into hospital.patient values(?,?,?,?,?,?)");
		
		System.out.println("enter the your details ");
		System.out.println("enter the pid");
		String pid=sc.next();
		ps.setString(1, pid);
		System.out.println("enter the pname");
		String pname=sc.next();
		ps.setString(2, pname);
		System.out.println("enter the pproblem");
		String problem=sc.next();
		ps.setString(3, problem);
		System.out.println("enter the age");
		String page=sc.next();
		ps.setString(4, page);
		System.out.println("enter the pmobile");
		String  pmobile=sc.next();
		ps.setString(5,  pmobile);
		System.out.println("enter the did");
		String  did=sc.next();
		ps.setString(6,  did);
		
		ps.executeUpdate();
		System.out.println("paitent details added");
		
		System.out.println("*****************  bill  ****************");
		
		Connection con1 = DriverManager.getConnection(url);
		PreparedStatement psSelectBId = con1.prepareStatement(qury2);

		psSelectBId.setString(1, doctorId);

		ResultSet rs = psSelectBId.executeQuery();

		
		while (rs.next()) {
			String dId = rs.getString("doctorID");
			String doctorName = rs.getString("doctorName");
			String doctorSpecilist = rs.getString("doctorSpecilist");
			String doctorFees = rs.getString("doctorFees");
//			String doctorSalary = rs.getString("doctorSalary");

			System.out.println(
					"did    : "+dId + "\n" +"dname    :"+doctorName + "\n" +"dspesilst    :"+doctorSpecilist + "\n"+"fees    :"+ doctorFees );

		}

		    
	
			System.out.println("we hope your helth is good");
			
	
		
		
		
		
		
		System.out.println("select the doctor based on your helath issues ");
		
		
		

	}

	public void update(String doctorId) {

		System.out.println("***************************");
		System.out.println("1.id                      *");
		System.out.println("2.name                    *");
		System.out.println("3.spesilist               *");
		System.out.println("4.fess                    *");
		System.out.println("5.salary                  *");
		System.out.println("***************************");
		System.out.println("select what do you want to update choice");
		int choice = sc.nextInt();
		Connection con;
		switch (choice) {
		case 1:
			
			try {
				con = DriverManager.getConnection(url);
				PreparedStatement psUpdate = con.prepareStatement(update1);

				System.out.println("enter the new id to the  paticular row");
				String id = sc.next();
				psUpdate.setString(1, id);
				psUpdate.setString(2, doctorId);
				psUpdate.executeUpdate();

			} catch (SQLException e) {

				e.printStackTrace();
			}
			System.out.println("data updated");

			break;

		case 2:
			
			
			try {
				con = DriverManager.getConnection(url);
				PreparedStatement psUpdate = con.prepareStatement(update2);

				System.out.println("enter the update name to the  paticular row");
				String dname = sc.next();
				psUpdate.setString(1, dname);
				psUpdate.setString(2, doctorId);
				psUpdate.executeUpdate();

			} catch (SQLException e) {

				e.printStackTrace();
			}
			System.out.println("data updated");


			break;

		case 3:
			
			try {
				con = DriverManager.getConnection(url);
				PreparedStatement psUpdate = con.prepareStatement(update3);

				System.out.println("enter the update  spesilist to the  paticular row");
				String spesilist = sc.next();
				psUpdate.setString(1, spesilist);
				psUpdate.setString(2, doctorId);
				psUpdate.executeUpdate();

			} catch (SQLException e) {

				e.printStackTrace();
			}
			System.out.println("data updated");


			break;
		case 4:
             
			
			try {
				con = DriverManager.getConnection(url);
				PreparedStatement psUpdate = con.prepareStatement(update4);

				System.out.println("enter the upadte the fee to the  paticular row");
				String fee= sc.next();
				psUpdate.setString(1, fee);
				psUpdate.setString(2, doctorId);
				psUpdate.executeUpdate();

			} catch (SQLException e) {

				e.printStackTrace();
			}
			System.out.println("data updated");

			break;
		case 5:
			
			
			try {
				con = DriverManager.getConnection(url);
				PreparedStatement psUpdate = con.prepareStatement(update5);

				System.out.println("enter the update the salaray to the  paticular row");
				String salary = sc.next();
				psUpdate.setString(1, salary);
				psUpdate.setString(2, doctorId);
				psUpdate.executeUpdate();

			} catch (SQLException e) {

				e.printStackTrace();
			}
			System.out.println("data updated");


			break;

		default:
			System.out.println("you enter the wrong choice");

		}

	}

}
