package com.aditya.Assignment1;

import java.util.Comparator;

public class SortByRating implements Comparator<TshirtDetails>{
	
	public int compare(TshirtDetails o1, TshirtDetails o2) {
		
		Double a = o1.Rating;
		Double b = o2.Rating;
		
		return (int) Math.floor((a - b));
	}
}
