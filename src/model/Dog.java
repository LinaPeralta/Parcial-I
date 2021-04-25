package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Dog  implements Comparable <Dog>{
	
	private PApplet app;
	private String Id;
	private String Name;
	private String Date;
	private String Breed;
	private ArrayList<String> list;
	int x;
	//int y;
	


	public Dog (PApplet app, String Id, String Name) {
		this.app=app;
		this.Id=Id;
		this.Name=Name;
		
		
		//arraylist
		
		list  = new ArrayList<>();
		
		//add variables
		list.add(Id);
		list.add(Name);
		
		//posicion inicial en x
		x = 113;
		//y = 263;
		
	}
	
	public void draw(int y) {
		
		for (int i = 0; i < list.size(); i++) {
			app.textSize(15);
			app.text(list.get(i), (i*80)+x, y);
			
		}
		


	}

	@Override
	public int compareTo(Dog newDog) {
		return 0;
//		return this.Id.compareTo(newDog.ge());
	}
	
	

}
