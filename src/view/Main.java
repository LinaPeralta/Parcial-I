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

	int x;
	int y1;
	int y2;
	int y3;
	int y4;
	int y5;



	@Override
	public void settings() {
		size(1000, 600);
	}

	@Override
	public void setup() {

		controller = new Controller(this);

		// img pantalla
		PANTALLA = loadImage("data/IMG/PELUDOS.png");
		// imgs perros
		BULLDOG = loadImage("data/IMG/BULLDOG.jpg");
		HUSKY = loadImage("data/IMG/HUSKY.jpg");
		LABRADOR = loadImage("data/IMG/LABRADOR.jpg");
		PASTOR = loadImage("data/IMG/PASTOR.jpg");
		ROTTWEILER = loadImage("data/IMG/ROTTWEILER.jpg");

		x = 40;
		y1 = 248;
		y2 = 298;
		y3 = 348;
		y4 = 398;
		y5 = 448;

	}

	@Override
	public void draw() {

		// Fondo
		imageMode(CORNER);
		image(PANTALLA, 0, 0);

		img();
		
		//titulos 
		
		
		fill (128,0,59);
		text("ID", 107, 230);
		text("NOMBRE", 200, 230);
		text("RAZA", 387, 230);
		text("FECHA", 647, 230);
		
		
		
		
		
		
		//controller.sortList();
		
		//llamar draw de controller
		
		controller.controllerDraw();

		 System.out.println(mouseX + "," + mouseY);

	}

	// metodo para pintar las imagenes de los perros
	public void img() {

		// img PASTOR
		imageMode(CORNER);
		image(PASTOR, x, y1);
		PASTOR.resize(50, 40);

		// img bulldog
		imageMode(CORNER);
		image(BULLDOG, x, y2);
		BULLDOG.resize(50, 40);

		// img LABRADOR
		imageMode(CORNER);
		image(LABRADOR, x, y3);
		LABRADOR.resize(50, 40);

		// img HUSKY
		imageMode(CORNER);
		image(HUSKY, x, y4);
		HUSKY.resize(50, 40);

		// img ROTTWEILER
		imageMode(CORNER);
		image(ROTTWEILER, x, y5);
		ROTTWEILER.resize(50, 40);

	}

	@Override
	public void keyPressed() {

		

	}

}
