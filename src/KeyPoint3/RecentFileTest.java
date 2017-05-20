package KeyPoint3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RecentFileTest {
	
	
	

	@Test
	public void test() {
		List<File> list = new ArrayList<>();
		RecentFile recentFile = new RecentFile(list);
		
		File file1 = new File("file1");
		File file2 = new File("file2");
		File file3 = new File("file3");
		
			
		recentFile.addFile(file1);
		recentFile.addFile(file2);
		recentFile.addFile(file3);
		recentFile.addFile(file1);
		assertEquals(recentFile.getListOfRecentFiles().get(0).getNameFile(),"file1");
		assertEquals(recentFile.getListOfRecentFiles().get(1).getNameFile(),"file2");
		assertEquals(recentFile.getListOfRecentFiles().get(2).getNameFile(),"file3");
		
		
	}
	
	

}
