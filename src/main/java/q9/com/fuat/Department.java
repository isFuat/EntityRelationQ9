package q9.com.fuat;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Department implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String description;

	@OneToOne
	private Employee employee;

	public Department(String name, String description, Employee employee) {
		super();
		this.name = name;
		this.description = description;
		this.employee = employee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
