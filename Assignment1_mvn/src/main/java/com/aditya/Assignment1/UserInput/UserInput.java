package com.aditya.Assignment1.UserInput;

public class UserInput {
	String color, Size, gender, outputPreference;
	

	public UserInput(String color, String size, String gender, String outputPreference) {
		super();
		this.color = color;
		Size = size;
		this.gender = gender;
		this.outputPreference = outputPreference;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getOutputPreference() {
		return outputPreference;
	}

	public void setOutputPreference(String outputPreference) {
		this.outputPreference = outputPreference;
	}

	@Override
	public String toString() {
		return "color: " + color + ", Size: " + Size + ", gender: " + gender + ", OutputPreference: " + outputPreference;
	}

}