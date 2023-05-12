package secondlevelCache;


import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)

public class Laptop {
	
	@Id
	@GeneratedValue
	private int laptopId;
	private String laptopName;
	private String laptopRam;
	

}
