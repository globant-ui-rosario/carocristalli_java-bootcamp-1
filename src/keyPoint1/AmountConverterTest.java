package keyPoint1;

import org.junit.Test;

public class AmountConverterTest {

	@SuppressWarnings("static-access")
	@Test
	public void test() {
		AmountConverter ac = new AmountConverter();
		System.out.println(ac.convertNumberToLetter(2523.04));
		
	}

}
