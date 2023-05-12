package doctorDao;

import java.util.List;
import Hospital.Doctor;
import Hospital.Patient;

public class DoctorDao {

	public interface DoctorDAO {
		public void addDoctor();

		public List<Doctor> viewDoctor(int doctorid);

		public List<Doctor> viewAlldoctors();

		public void replaceDoctor(int doctorid);

		public void removeDoctor(int doctorid);

		public List<Patient> viewPatient();

		public void appointment();

		public void back();

	}

}
