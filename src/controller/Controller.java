package controller;

import model.Logic;
import processing.core.PApplet;

public class Controller {
	
	private PApplet app;
	Logic logic;


	public Controller(PApplet app) {
		this.app = app;
		logic = new Logic(app);
		
	}
	
	public void controllerDraw () {
		
	logic.draw();
		
	}
	
	public void sortList(char a) {
		
	logic.sortList(a);
		

	}
	
	
	public void saveText() {

	}


}
