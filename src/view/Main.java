package view;

import controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {

	public static void main(String[] args) {
		PApplet.main("view.Main");

	}

	Controller controller;
	PImage PANTALLA;
	PImage BULLDOG;
	PImage HUSKY;
	PImage LABRADOR;
	PImage PASTOR;
	PImage ROTTWEILER;
	

	@Override
	public void settings() {
		size(1000, 600);
	}

	@Override
	public void setup() {

		controller = new Controller(this);

		// img pantalla
		PANTALLA = loadImage("data/IMG/PELUDOS.png");
		//imgs perros
		BULLDOG = loadImage("data/IMG/BULLDOG.png");
		HUSKY = loadImage("data/IMG/HUSKY.png");
		LABRADOR = loadImage("data/IMG/LABRADOR.png");
		PASTOR = loadImage("data/IMG/PASTOR.png");
		ROTTWEILER = loadImage("data/IMG/ROTTWEILER.png");
	
	}

	@Override
	public void draw() {

		// Fondo
		imageMode(CORNER);
		image(PANTALLA, 0, 0);
		

		// System.out.println(mouseX + "," + mouseY);

	}
	
	//metodo para pintar las imagenes de los perros
	public void img() {
		
		
		
	}
	
	@Override
	public void keyPressed() {
	
	}

}
