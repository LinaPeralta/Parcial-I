package model;

import processing.core.PApplet;

public class Logic {

	String Id;
	String Name;
	String Date;
	String Breed;

	Dog dog;
	private PApplet app;
	
	//listOfDog
	
	String [] text1;
	String [] text2;

	public Logic(PApplet app) {
		this.app = app;
		dog = new Dog(app, Id, Name, Date, Breed);

	}

	public void draw() {

	}

	public void sortList() {

	}
	
	public void saveText() {

	}

}
