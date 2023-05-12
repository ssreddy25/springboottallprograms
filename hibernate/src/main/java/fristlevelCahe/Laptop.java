package fristlevelCahe;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Laptop {
	
	@Id
	@GeneratedValue
	private int laptopId;
	private String laptopName;
	private String laptopRam;
	

}
