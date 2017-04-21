package keyPoint2;
//First Concrete Builder
public class StudioApartmentHouseBuilder implements HouseBuilder {
	
	private House house;
	
	public StudioApartmentHouseBuilder(){
		this.house = new House();
	}

	@Override
	public void buildAddress() {
		this.house.setAddress("2050 Bamako Place. Washington, DC 20521-2050");
		
	}

	@Override
	public void buildRooms() {
		this.house.setRooms(2);
		
	}

	@Override
	public void buildSquaredMeters() {
		this.house.setSquaredMeters(20.5);
		
	}

	@Override
	public House getHouse() {
		
		return this.house;
	}

}
