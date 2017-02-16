package fi.kaamos.bean;

public class ServiceLog {

	private int id;
	private int vehicleId;
	private String entry;
	private String date;
	
	public ServiceLog() {
		super();
	}

	public ServiceLog(int id, int vehicleId, String entry, String date) {
		super();
		this.id = id;
		this.vehicleId = vehicleId;
		this.entry = entry;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
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

	@Override
	public String toString() {
		return "ServiceLog [id=" + id + ", vehicleId=" + vehicleId + ", entry=" + entry + ", date=" + date + "]";
	}
	
}
