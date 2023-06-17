package com.aditya.Assignment1;

import java.util.Comparator;

public class SortByPrice implements Comparator<TshirtDetails>  {
	
	public int compare(TshirtDetails o1, TshirtDetails o2) {
		Double a = o1.Price;
		Double b = o2.Price;
		return (int)(a - b);
	}
}
