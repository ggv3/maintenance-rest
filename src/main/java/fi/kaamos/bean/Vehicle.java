package fi.kaamos.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int type;
	private String displayname;
	private int totalkilometersdriven;
	private String latestinspectiondate;
	private String lastinspectiondate;
	private String latestoilchange;
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "userid")
	private User user;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "vehicle")
	private List<Servicelog> servicelog;
	
	public Vehicle() {
		super();
	}

	public Vehicle(int id, int userId, int type, String displayname,
			int totalkilometersdriven, String latestinspectiondate,
			String lastinspectiondate, String latestoilchange, User user,
			List<Servicelog> servicelog) {
		super();
		this.id = id;
		this.type = type;
		this.displayname = displayname;
		this.totalkilometersdriven = totalkilometersdriven;
		this.latestinspectiondate = latestinspectiondate;
		this.lastinspectiondate = lastinspectiondate;
		this.latestoilchange = latestoilchange;
		this.user = user;
		this.servicelog = servicelog;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getdisplayname() {
		return displayname;
	}

	public void setdisplayname(String displayname) {
		this.displayname = displayname;
	}

	public int gettotalkilometersdriven() {
		return totalkilometersdriven;
	}

	public void settotalkilometersdriven(int totalkilometersdriven) {
		this.totalkilometersdriven = totalkilometersdriven;
	}

	public String getlatestinspectiondate() {
		return latestinspectiondate;
	}

	public void setlatestinspectiondate(String latestinspectiondate) {
		this.latestinspectiondate = latestinspectiondate;
	}

	public String getlastinspectiondate() {
		return lastinspectiondate;
	}

	public void setlastinspectiondate(String lastinspectiondate) {
		this.lastinspectiondate = lastinspectiondate;
	}

	public String getlatestoilchange() {
		return latestoilchange;
	}

	public void setlatestoilchange(String latestoilchange) {
		this.latestoilchange = latestoilchange;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Servicelog> getServicelog() {
		return servicelog;
	}

	public void setServicelog(List<Servicelog> servicelog) {
		this.servicelog = servicelog;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", type=" + type
				+ ", displayname=" + displayname + ", totalkilometersdriven="
				+ totalkilometersdriven + ", latestinspectiondate="
				+ latestinspectiondate + ", lastinspectiondate="
				+ lastinspectiondate + ", latestoilchange=" + latestoilchange
				+ ", user=" + user + ", servicelog=" + servicelog + "]";
	}
}
