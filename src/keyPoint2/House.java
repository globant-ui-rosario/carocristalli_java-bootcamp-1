package keyPoint2;

public class House {
	
	private String address;
	private int rooms;
	private double squaredMeters;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String adress) {
		this.address = adress;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public double getSquaredMeters() {
		return squaredMeters;
	}
	public void setSquaredMeters(double squaredMeters) {
		this.squaredMeters = squaredMeters;
	}
	@Override
	public String toString() {
		return "House is: [address=" + address + ", rooms=" + rooms + ", squaredMeters=" + squaredMeters + "]";
	}
	
	
	

}
