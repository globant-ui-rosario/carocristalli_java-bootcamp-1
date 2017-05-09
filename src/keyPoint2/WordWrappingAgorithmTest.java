package keyPoint2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordWrappingAgorithmTest {

	@Test
	public void test() {
		String text = "Globant";
		int rowLength = 2;
		String wordWrapped = WordWrappingAgorithm.wrap(text,rowLength);	
		System.out.println(wordWrapped);
		assertEquals("Gl ob an t", wordWrapped);
		
	}

	@Test
	public void test2() {
		String text = "Excelent";
		int rowLength = 5;
		String wordWrapped = WordWrappingAgorithm.wrap(text,rowLength);	
		System.out.println(wordWrapped);
		assertEquals("Excel ent", wordWrapped);
		
	}
	
	@Test
	public void test3() {
		String text = "Hello, Word!";
		int rowLength = 7;
		String wordWrapped = WordWrappingAgorithm.wrap(text,rowLength);	
		System.out.println(wordWrapped);
		assertEquals("Hello,  Word!", wordWrapped);
		
	}
}
