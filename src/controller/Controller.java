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
	
	public void sortList() {
		
	//	logic.split();

	}
	
	public void saveText() {

	}


}
