package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {

	String Id;
	String Name;
	String Date;
	String Breed;

	Dog dog;
	private PApplet app;

	// listOfDog

	String[] text1;
	String[] text2;
	private ArrayList<String> texto1;
	private ArrayList<String> texto2;
	private ArrayList<String> variables1;
	private ArrayList<String> variables2;
	private ArrayList<String> id;
	private ArrayList<String> name;

	public Logic(PApplet app) {
		this.app = app;
		dog = new Dog(app, Id, Name, Date, Breed);

		// cargar txt

		text1 = app.loadStrings("./data/imports/Text1.txt");
		text2 = app.loadStrings("./data/imports/Text2.txt");

	}

	public void split() {
		// pasar el txt1 a variables (en un arraylist)

		for (int i = 0; i < text1.length; i++) {
			String[] variables = app.split(text1[i], " ");
			for (int j = 0; j < variables.length; j++) {
				variables1.add(variables[j]);
			}
		}
		
		for (int i = 0; i < variables1.size(); i++) {
			//String word = variables1.get(i);
			
			if (i%2 == 0) {
				id.add(variables1.get(i));	
			} else {
				name.add(variables1.get(i));	
			}		
		}
		
		
		//pasar el txt2 a variables (en un arraylist)
		
		for (int i = 0; i < text2.length; i++) {
			String[] variables = app.split(text2[i], " ");
			for (int j = 0; j < variables.length; j++) {
				variables2.add(variables[j]);
			}
		}
	}


	public void draw() {

	}

	public void sortList() {

	}

	public void saveText() {

	}

}
