package keyPoint2;
//Second Concrete Builder
public class MansionHouseBuilder implements HouseBuilder {
	
	private House house;
	
	public MansionHouseBuilder(){
		this.house = new House();
	}

	@Override
	public void buildAddress() {
		this.house.setAddress("7100 Athens Place. Washington, DC 20521-2050");
		
	}

	@Override
	public void buildRooms() {
		this.house.setRooms(16);
		
	}

	@Override
	public void buildSquaredMeters() {
		this.house.setSquaredMeters(674.3);
		
	}

	@Override
	public House getHouse() {
		
		return this.house;
	}

}
