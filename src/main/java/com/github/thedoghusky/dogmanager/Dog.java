package com.github.thedoghusky.dogmanager;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Dog {
	
	@NotNull
	@Size(min = 2, max = 28)
	String name;
	@NotNull
	@Size(min = 2, max = 28)
	String breed;
	Integer age;
	Boolean owned;
	
	public Dog(String name, String breed, Integer age, Boolean isOwned) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.owned = isOwned;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean isOwned() {
		return owned;
	}

	public Boolean getOwned() {
		return owned;
	}

	public void setOwned(Boolean isOwned) {
		this.owned = isOwned;
	}

	@Override
	public String toString() {  
		return "\n--\nINFOS CHIEN - " + name + " \nRace: " + breed + " \n�ge: " + age + " \nA-t-il un Maitre: " + owned;
	}	
}
