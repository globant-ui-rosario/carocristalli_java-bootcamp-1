package KeyPoint3;

import java.util.List;

public class RecentFile {
	
	private List<File> listOfRecentFiles;

	public RecentFile(List<File> listOfRecentFiles) {
		super();
		this.listOfRecentFiles = listOfRecentFiles;
	}

	public List<File> getListOfRecentFiles() {
		return listOfRecentFiles;
	}

	public void setListOfRecentFiles(List<File> listOfRecentFiles) {
		this.listOfRecentFiles = listOfRecentFiles;
	}
	
	public boolean isFullList() {
		boolean response;
		if(this.getListOfRecentFiles().size()>=14){
			response = true;
		}else {
			response = false;
		}
		return response;
	}
	
	public void addFile(File file) {
		
		if (listOfRecentFiles.size()==0){
			this.listOfRecentFiles.add(file);
		}else
		
			if(listOfRecentFiles.contains(file)){
				listOfRecentFiles.remove(file);
				listOfRecentFiles.add(0,file);
				System.out.println("The file has been moved to the top");
				}else if(isFullList()){ 
						listOfRecentFiles.remove(15);
						listOfRecentFiles.add(file);
						System.out.println("The file has been added to the list");
					}
				else{
					listOfRecentFiles.add(file);
					System.out.println("The file has been added to the list");
				}
		
		
		
		
}

}
