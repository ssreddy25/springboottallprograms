package jdbcjaxwsrpctype;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.mysql.cj.xdevapi.PreparableStatement;

@WebService(endpointInterface="jdbcjaxwsrpctype.Employee")
public class EmployeeImplmenting implements Employee {

	static Connection con = DbUtility.getConnection();

	@Override
	@WebMethod
	public List<Employeee> viewall() {
		
		List<Employeee> emp=new ArrayList<>();

		try {
			PreparedStatement ps = con.prepareStatement("select * from usertable");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
               
				Employeee employ=new Employeee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10));
				
				emp.add(employ);
				

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return emp;
	}

}
