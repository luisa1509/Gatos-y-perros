package view;

import model.Logic;
import processing.core.PApplet;

public class Main extends PApplet{

	Logic logic;
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}

	public void settings() {
		size(600,600);
	}
	
	public void setup() {
		logic = new Logic(this);
	}
	
	public void draw() {
		background(255);
	}
	public void keyPressed() {}

}
