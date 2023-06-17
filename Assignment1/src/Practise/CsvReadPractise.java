package Practise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReadPractise {

	public static void main(String[] args) throws IOException {
		
		String file = "src\\Adidas.csv";	
		BufferedReader br = null;
		String line ="";
		
		try {	
			br = new BufferedReader(new FileReader(file));
			
			while((line = br.readLine()) != null) {
				String[] row = line.split(",");
				
				for(String item: row) {
				System.out.printf("%-50s", item);
				}
				System.out.println();
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			br.close();
		}

	}
}

