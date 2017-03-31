package fi.kaamos.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Servicelog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String entry;
	private String date;
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="vehicleid")
	private Vehicle vehicle;
	public Servicelog() {
		super();
	}
	public Servicelog(int id, String entry, String date, Vehicle vehicle) {
		super();
		this.id = id;
		this.entry = entry;
		this.date = date;
		this.vehicle = vehicle;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEntry() {
		return entry;
	}
	public void setEntry(String entry) {
		this.entry = entry;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		return "ServiceLog [id=" + id + ", entry=" + entry + ", date=" + date
				+ ", vehicle=" + vehicle + "]";
	}
	
	
	
}
