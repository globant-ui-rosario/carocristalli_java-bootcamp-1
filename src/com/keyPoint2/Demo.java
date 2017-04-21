package com.keyPoint2;

public class Demo {

	public static void main(String[] args) {

		HouseBuilder houseBuilder = new StudioApartmentHouseBuilder();
		HouseDirector houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		House house = houseDirector.getHouse();
		System.out.println(house);
		
		houseBuilder = new MansionHouseBuilder();
		houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		house = houseDirector.getHouse();
		System.out.println(house);
	}

}
