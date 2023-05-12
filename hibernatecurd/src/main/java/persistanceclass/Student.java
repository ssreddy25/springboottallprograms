package persistanceclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class Student {
	@Id
	@GeneratedValue
	private int studentId;
	private String studentName;
	private String studentCourse;
	private double studentFess;
	private String studentAddress;
	

}
