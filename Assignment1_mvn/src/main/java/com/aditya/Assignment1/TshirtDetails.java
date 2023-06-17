package com.aditya.Assignment1;


public class TshirtDetails {
	

	public String Id, Name, Color, Gender, Size, Availability;
	public Double Price, Rating;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public Double getRating() {
		return Rating;
	}

	public void setRating(Double rating) {
		Rating = rating;
	}

	public String getAvailability() {
		return Availability;
	}

	public void setAvailability(String availability) {
		Availability = availability;
	}

	
	@Override
	public String toString() {
		return "TshirtDetails [Id=" + Id + ", Name=" + Name + ", Color=" + Color +", Gender=" + Gender + 
								", Size=" + Size + ", Price="+ Price + ", Rating=" + Rating + 
								", Availability=" + Availability + "]";
	}

}
