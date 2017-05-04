package KeyPoint3;

public class DemoHospital {
	
	public static void main(String[] args) {

	
	HospitalFactory hospitalFactory = new HospitalFactory();
	
	Hospital privateHospital = hospitalFactory.getHospital("private");
	Hospital publicHospital = hospitalFactory.getHospital("public");
	
	System.out.println("You must pay for this services: " + privateHospital.hospitalType());
	System.out.println("Don't wring your wallet: " + publicHospital.hospitalType());
			
	}

}
