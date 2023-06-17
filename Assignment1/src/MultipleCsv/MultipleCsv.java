package MultipleCsv;
import java.io.*;
import java.util.*;
public class MultipleCsv {

	public static void main(String[] args) throws IOException {
		
		
		final File folder = new File("src\\Assigment Links");
		listFilesForFolder(folder);
		
		String line="";
		for(String csvItem: MultipleCsv.filenames) {
			BufferedReader br = new BufferedReader(new FileReader(csvItem));
			
			while((line = br.readLine()) != null) {
				
			}
			
			
		}

		
	
	}

	static List<String> filenames = new LinkedList<String>();
	
	
	public static void listFilesForFolder(final File folder) {
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry);
	        } else {
	            if(fileEntry.getName().contains(".csv"))
	                filenames.add(fileEntry.getPath());
	        }
	    }
	}

	

	

}
