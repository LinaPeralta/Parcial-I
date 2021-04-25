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
	int a;
	int y;

	// listOfDog

	String[] text1;
	String[] text2;
	private ArrayList<String> variables1;
	private ArrayList<String> variables2;
	private ArrayList<Dog> dogsList;
	private ArrayList<String> id;
	private ArrayList<String> name;

	public Logic(PApplet app) {
		this.app = app;
		dog = new Dog(app, Id, Name);

		
		//arraylist
		variables1 = new ArrayList<>();
		variables2 = new ArrayList<>();
		dogsList = new ArrayList<>();
		id = new ArrayList<>();
		name = new ArrayList<>();
		
		
		
		// cargar txt

		text1 = app.loadStrings("./data/imports/Text1.txt");
		text2 = app.loadStrings("./data/imports/Text2.txt");

		y =263;
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
			// String word = variables1.get(i);

			if (i % 2 == 0) {
				id.add(variables1.get(i));
			} else {
				name.add(variables1.get(i));
			}
		}

		// pasar el txt2 a variables (en un arraylist)

		for (int i = 0; i < text2.length; i++) {
			String[] variables = app.split(text2[i], " ");
			for (int j = 0; j < variables.length; j++) {
				variables2.add(variables[j]);
			}
			
			
			
		}

		//System.out.println(variables1);
	}

	public void draw() {
		
		for (int i = 0; i < dogsList.size(); i++) {
			
			dogsList.get(i).draw((i*50)+y);
		}

	}

	public void sortList() {

		switch (a) {

		case 'i':

			System.out.println("ordenar por ID");
			break;

		case 'n':

			System.out.println("ordenar por nombre");
			break;
			
		case 'b':

			System.out.println("ordenar por raza");
			break;
			
		case 'd':

			System.out.println("ordenar por fecha");
			break;
		}
		

	}

	public void saveText() {

	}

}
