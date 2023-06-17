package com.springcore.standalonecollections;

import java.util.*;

public class Person {
	
	private List<String> bestfriend;
	private Map<String, Integer> feesStructure;
	private Properties properties;

	public List<String> getBestfriend() {
		return bestfriend;
	}

	public void setBestfriend(List<String> bestfriend) {
		this.bestfriend = bestfriend;
	}

	public Map<String, Integer> getFeesStructure() {
		return feesStructure;
	}

	public void setFeesStructure(Map<String, Integer> feesStructure) {
		this.feesStructure = feesStructure;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	

}
