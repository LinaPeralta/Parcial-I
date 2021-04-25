package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import processing.core.PApplet;

public class Logic {

	String Id = "1";
	String Name = "Martina";
	String Date = "Labrador-retriever";
	String Breed = "11-04-2019";

	Dog dog;
	private PApplet app;
	int a;
	int y;

	String[] text1;
	String[] text2;
	private ArrayList<String> variables1;
	private ArrayList<String> variables2;
	private ArrayList<Dog> dogsList;
	private ArrayList<String> id;
	private ArrayList<String> name;
	private ArrayList<String> breed;
	private ArrayList<String> date;
	
	private DogName dogName;
	private DogBreed dogBreed;
	private DogDate dogDate;


	public Logic(PApplet app) {
		this.app = app;
		dog = new Dog(app, Id, Name,Breed,Date);

		// arraylist
		variables1 = new ArrayList<>();
		variables2 = new ArrayList<>();
		dogsList = new ArrayList<>();
		id = new ArrayList<>();
		name = new ArrayList<>();
		breed = new ArrayList<>();
		date = new ArrayList<>();

		// cargar txt

		text1 = app.loadStrings("./data/imports/Text1.txt");
		text2 = app.loadStrings("./data/imports/Text2.txt");

		y = 263;

		split();
		createDog();
		
		dogName = new DogName ();
		dogBreed= new DogBreed ();
		dogDate = new DogDate ();
	}

	public void split() {
		// pasar el txt1 a variables (en un arraylist)

		for (int i = 0; i < text1.length; i++) {
			String[] variables = app.split(text1[i], " ");
			for (int j = 0; j < variables.length; j++) {
				variables1.add(variables[j]);
			}
		}

		// asignar los valores a sus respectivos arraylist
		for (int i = 0; i < variables1.size(); i++) {

			if (i % 2 == 0) {
				id.add(variables1.get(i));
			} else {
				name.add(variables1.get(i));

			}
		}

		// pasar el txt2 a variables (en un arraylist)
		
		//ordenar los datos en el array
		Arrays.sort(text2);

		//split del array
		for (int i = 0; i < text2.length; i++) {
			String[] variables = app.split(text2[i], " ");
			for (int j = 0; j < variables.length; j++) {
				variables2.add(variables[j]);
			}
		}
			
			//remover ID del txt2
			variables2.remove("1");
			variables2.remove("2");
			variables2.remove("3");
			variables2.remove("4");
			variables2.remove("5");
			

			// asignar los valores a sus respectivos arraylist
			for (int k = 0; k < variables2.size(); k++) {

				if (k % 2 == 0) {
					breed.add(variables2.get(k));
				} else {
					date.add(variables2.get(k));
				}
			}

		System.out.println(breed);
		System.out.println(date);
	
	}

	public void createDog() {

		for (int i = 0; i < 5; i++) {

    	dogsList.add(new Dog(app, id.get(i), name.get(i),breed.get(i), date.get(i)));
		}
	}

	public void draw() {

		for (int i = 0; i < dogsList.size(); i++) {
			int yt = 263;

			dogsList.get(i).draw((i * 50) + yt);
		}

		// draw the Dog
		dog.draw(y);

	}

	public void sortList() {

		switch (a) {

		case 'i':
			Collections.sort(dogsList);
	
			System.out.println("ordenar por ID");
			break;

		case 'n':
			Collections.sort(dogsList,dogName);
			
			System.out.println("ordenar por nombre");
			break;

		case 'b':
			Collections.sort(dogsList,dogBreed);
			
			System.out.println("ordenar por raza");
			break;

		case 'd':
			Collections.sort(dogsList,dogDate);

			System.out.println("ordenar por fecha");
			break;
		}

	}

	public void saveText() {

	}

}
