package keyPoint2;

import java.util.ArrayList;
import java.util.List;

public class WordWrappingAgorithm {
	
	
	
	public static String wrap(String text, int rowLength) {
		String wordWrapped="";
		List<String> array = new ArrayList<>();
		int i = 0;
		while (i < text.length()) {
			int sum = i + rowLength;
			array.add(text.substring(i, Math.min(sum,text.length())));
		    i =i + rowLength;
		    if(i < text.length()){array.add(" ");}
		}
		
		for(String word: array){
			wordWrapped = wordWrapped + word;
		}
				
		return wordWrapped;
}



}
