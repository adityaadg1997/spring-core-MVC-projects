package com.aditya.Assignment1.Main;

import java.io.File;
import java.util.*;

public class CSVLinks {
 	
   static public List<String> getCsvPath(){
			File folder = new File("src\\main\\resources\\Assigment Links");
			listFilesForFolder(folder);
	
			List<String> csvPathsLists = CSVLinks.filenames;
			
			return csvPathsLists;
	}
	
	
	

	//created a list of files in present in folder and add the path of the files.
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
