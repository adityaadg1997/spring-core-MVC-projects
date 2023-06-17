package com.aditya.Assignment1;

import java.io.Reader;

import com.aditya.Assignment1.Main.CSVLinks;
import com.opencsv.CSVReader;
import java.nio.file.*;
import java.util.*;
import com.opencsv.CSVReaderBuilder;

public class OpenCSVReader {
	static	List<TshirtDetails> TShirtList = new LinkedList<TshirtDetails>();
	
	public List<TshirtDetails> getCsvRecords(){
		{
			for(String csvPathitems : CSVLinks.getCsvPath()) {
				try{
					Reader reader = Files.newBufferedReader(Paths.get(csvPathitems));
					CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
	
					// Reading All Records at once into a List<String[]>
					List<String[]> records = csvReader.readAll();

					for (String[] record : records) {
						TshirtDetails tShirt = new TshirtDetails();
						
						tShirt.setId(record[0]);
						tShirt.setName(record[1]);
						tShirt.setColor(record[2]);
						tShirt.setGender(record[3]);
						tShirt.setSize(record[4]);
						tShirt.setPrice(Double.parseDouble(record[5]));
						tShirt.setRating(Double.parseDouble(record[6]));
						tShirt.setAvailability(record[7]);

						TShirtList.add(tShirt);
						
					}

				}catch(Exception e) {
					e.printStackTrace();
				}

			}
		}
		return TShirtList;
	}


}
