package com.aditya.Assignment1.UserInput;

import java.util.*;

public class Input {

	static public UserInput input() {

		String enterColor = null;
		String enterGender=null;
		String enterSize=null;
		String enterOutputPreference=null;

		int enterOutputPreferenceCase=0;


		Scanner sc = new Scanner(System.in);

		try {		
			System.out.print("Enter Color : ");
			enterColor = sc.next();

			System.out.print("Enter Size : ");
			enterSize = sc.next();

			System.out.print("Enter gender : ");
			enterGender = sc.next();

			System.out.print("Enter OutputPreference orderBy : press 1 - Price" +  "\t" 
					+ "press 2 - Rating" +  "\t" + "press 3 - Both");
			enterOutputPreferenceCase = sc.nextInt();

			switch(enterOutputPreferenceCase){
			case 1:
				enterOutputPreference = "1";
				break;
			case 2:
				enterOutputPreference = "2";
				break;
			case 3:
				enterOutputPreference = "3";
				break;
			}


		}catch(InputMismatchException e) {
			System.out.println("Please Enter a Valid Input");
		}finally {
			sc.close();
		}


		return (new UserInput(enterColor, enterSize, enterGender, enterOutputPreference));

	}

}
