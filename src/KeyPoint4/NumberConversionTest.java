package KeyPoint4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberConversionTest {

	@Test
	public void test() {
				
		for (int i = 1; i<= 100; i++) {
	        System.out.println(i+"\t =\t "+NumberConversion.toRoman(i));
	      
	    }

	}

	@Test
	public void shouldConvertSuccesfully() {
		assertEquals(NumberConversion.toRoman(11),"XI");
	}

}
