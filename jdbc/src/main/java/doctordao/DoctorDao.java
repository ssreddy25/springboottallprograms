package doctordao;

import java.util.List;

import docter.Doctor;
import paitentdat.Patient;

public interface DoctorDao {
     
	public void addDoctor();
	public Doctor viewDoctor(String doctorId);
	public Patient viewPatient(long patientAdhhar);
	public List<Patient> viewAllPatient();
	
	public List<Doctor> viewAllDoctor();
	public void updateDoctor(String doctorId );
	public void deleteDoctor(String doctorId);
	public void appointment();
	public void back();
	
}
