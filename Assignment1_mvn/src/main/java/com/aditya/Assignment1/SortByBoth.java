package com.aditya.Assignment1;

import java.util.Comparator;

public class SortByBoth implements Comparator<TshirtDetails> {

	public int compare(TshirtDetails o1, TshirtDetails o2) {
		
		if((o1.Price) == (o2.Price)) {
			return (int)((o1.Rating) - (o2.Rating));
		}else {
			return (int)((o1.Price) - (o2.Price));
		}
	}

}
