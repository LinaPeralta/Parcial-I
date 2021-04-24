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


	@Override
	public void settings() {
		size(1000, 600);
	}

	@Override
	public void setup() {

		controller = new Controller(this);

		// img pantalla
		PANTALLA = loadImage("data/IMG/PELUDOS.png");
	
	}

	@Override
	public void draw() {

		// Fondo
		imageMode(CORNER);
		image(PANTALLA, 0, 0);
		

		// System.out.println(mouseX + "," + mouseY);

	}
	
	@Override
	public void keyPressed() {
	
	}

}
