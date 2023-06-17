package com.aditya.Assignment1.Main;


import java.util.*;

import com.aditya.Assignment1.OpenCSVReader;
import com.aditya.Assignment1.SortByBoth;
import com.aditya.Assignment1.SortByPrice;
import com.aditya.Assignment1.SortByRating;
import com.aditya.Assignment1.TshirtDetails;
import com.aditya.Assignment1.UserInput.Input;
import com.aditya.Assignment1.UserInput.UserInput;

public class Main {

	public static void main(String[] args) {
		
		boolean found = false;
		ArrayList<TshirtDetails> output = new ArrayList<TshirtDetails>();

		UserInput userInput;
		try {
			userInput = Input.input();

			OpenCSVReader csvReader = new OpenCSVReader();

			for(TshirtDetails item: csvReader.getCsvRecords()) {

				if(item.getColor().contains(userInput.getColor()) && 
						item.getSize().contains(userInput.getSize()) && 
						item.getGender().contains(userInput.getGender())) {

					output.add(item);
					found = true;
				}
			}
			if(found) {
				if(userInput.getOutputPreference().contains("1")) {
					Collections.sort(output, new SortByPrice());
				}
				if(userInput.getOutputPreference().contains("2")) {
					Collections.sort(output, new SortByRating());
				}
				if(userInput.getOutputPreference().contains("3")) {
					Collections.sort(output, new SortByBoth());
				}
				
				for(TshirtDetails o : output) {
					System.out.println(o);
				}
			}
			if(!found) {
				System.out.println("Sorry No Match Found");
				System.out.println("Search Again");
			}



		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
