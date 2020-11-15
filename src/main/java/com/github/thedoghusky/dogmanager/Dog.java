package com.github.thedoghusky.dogmanager;

public class Dog {
	
	String name;
	String breed;
	int age;
	boolean isOwned;
	
	public Dog(String name, String breed, int age, boolean isOwned) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.isOwned = isOwned;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getBreed() {
		return breed;
	}



	public void setBreed(String breed) {
		this.breed = breed;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public boolean isOwned() {
		return isOwned;
	}



	public void setOwned(boolean isOwned) {
		this.isOwned = isOwned;
	}



	@Override
	public String toString() {  
		return "\n--\nINFOS CHIEN - " + name + " \nRace: " + breed + " \n�ge: " + age + " \nA-t-il un Maitre: " + isOwned;
	}	
}
