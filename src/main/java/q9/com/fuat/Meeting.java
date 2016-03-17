package q9.com.fuat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Meeting implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String description;
	@OneToMany
	private Collection<Department> categories = new ArrayList<>();
	public Meeting(String name, String description, Collection<Department> categories) {
		super();
		this.name = name;
		this.description = description;
		this.categories = categories;
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
	public Collection<Department> getCategories() {
		return categories;
	}
	public void setCategories(Collection<Department> categories) {
		this.categories = categories;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	

}
