package doctor;

import java.sql.SQLException;

public interface DoctorDao {
	
	public void  addDoctor() throws SQLException;
	public void viewDoctor(String doctorId) throws SQLException;
	
	public void update(String doctorId);
	
	public void deleteDoctor(String doctorId);
	public void viewAllDoctor() throws SQLException;
	
	public void appiontment(String doctorId) throws SQLException;
	

}
