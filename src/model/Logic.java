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
	String [] ArrayId;

	public Logic(PApplet app) {
		this.app = app;
		dog = new Dog(app, Id, Name, Date, Breed);
		
		//cargar txt
		
		text1 = app.loadStrings("./data/imports/Text1.txt");
		text2 = app.loadStrings("./data/imports/Text2.txt");

	}
	
	public void split () {
		//ArrayId = app.split(text1[], " ");
	}

	public void draw() {

	}

	public void sortList() {

	}
	
	public void saveText() {

	}

}
