package keyPoint2;

public class HouseDirector {
	
	private HouseBuilder houseBuilder = null;
	
	public HouseDirector(HouseBuilder houseBuilder){
		this.houseBuilder = houseBuilder;
	}
	
	public void constructHouse() {
		houseBuilder.buildAddress();
		houseBuilder.buildRooms();
		houseBuilder.buildSquaredMeters();
	}
	
	public House getHouse(){
		return houseBuilder.getHouse();
	}

}
