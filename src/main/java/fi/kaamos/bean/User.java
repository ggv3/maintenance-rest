package fi.kaamos.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String username;
	private String password;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<Vehicle> vehicles;

	public User() {
		super();
	}

	public User(int id, String username, String password, List<Vehicle> vehicles) {
		super();
		this.Id = id;
		this.username = username;
		this.password = password;
		this.vehicles = vehicles;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return "User [id=" + Id + ", username=" + username + ", password=" + password + ", vehicles=" + vehicles + "]";
	}

}
