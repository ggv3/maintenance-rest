package fi.kaamos.bean;

public class Vehicle {

	private int id;
	private int userId;
	private int type;
	private String displayName;
	private int totalKilometersDriven;
	private String latestInspectionDate;
	private String lastInspectionDate;
	private String latestOilChange;
	
	public Vehicle() {
		super();
	}

	public Vehicle(int id, int userId, int type, String displayName, int totalKilometersDriven,
			String latestInspectionDate, String lastInspectionDate, String latestOilChange) {
		super();
		this.id = id;
		this.userId = userId;
		this.type = type;
		this.displayName = displayName;
		this.totalKilometersDriven = totalKilometersDriven;
		this.latestInspectionDate = latestInspectionDate;
		this.lastInspectionDate = lastInspectionDate;
		this.latestOilChange = latestOilChange;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public int getTotalKilometersDriven() {
		return totalKilometersDriven;
	}

	public void setTotalKilometersDriven(int totalKilometersDriven) {
		this.totalKilometersDriven = totalKilometersDriven;
	}

	public String getLatestInspectionDate() {
		return latestInspectionDate;
	}

	public void setLatestInspectionDate(String latestInspectionDate) {
		this.latestInspectionDate = latestInspectionDate;
	}

	public String getLastInspectionDate() {
		return lastInspectionDate;
	}

	public void setLastInspectionDate(String lastInspectionDate) {
		this.lastInspectionDate = lastInspectionDate;
	}

	public String getLatestOilChange() {
		return latestOilChange;
	}

	public void setLatestOilChange(String latestOilChange) {
		this.latestOilChange = latestOilChange;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", userId=" + userId + ", type=" + type + ", displayName=" + displayName
				+ ", totalKilometersDriven=" + totalKilometersDriven + ", latestInspectionDate=" + latestInspectionDate
				+ ", lastInspectionDate=" + lastInspectionDate + ", latestOilChange=" + latestOilChange + "]";
	}
	
}
