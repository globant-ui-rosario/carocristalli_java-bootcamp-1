package KeyPoint3;

public class HospitalFactory {
	
public Hospital getHospital(String hospitalType) {
		
		if ("private".equals(hospitalType)) {

			return new PrivateHospital();

		} else if ("public".equals(hospitalType)) {
			return new PublicHospital();

		} else
			return null;
}

}
