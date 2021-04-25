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
		//x = 113;
		//y = 263;

		
	}
	
	public void draw(int y) {
	
		
		
		for (int i = 0; i < list.size(); i++) {
			int xt = 113;
			app.textSize(15);
			app.text(list.get(i),(i*80)+xt, y);
		
		}
		
	//	System.out.println(list);
		
		


	}

	@Override
	public int compareTo(Dog newDog) {
		return 0;
//		return this.Id.compareTo(newDog.ge());
	}



	public PApplet getApp() {
		return app;
	}



	public void setApp(PApplet app) {
		this.app = app;
	}



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



	public String getDate() {
		return Date;
	}



	public void setDate(String date) {
		Date = date;
	}



	public String getBreed() {
		return Breed;
	}



	public void setBreed(String breed) {
		Breed = breed;
	}



	public ArrayList<String> getList() {
		return list;
	}



	public void setList(ArrayList<String> list) {
		this.list = list;
	}



	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}
	
	
	
	
	

}
