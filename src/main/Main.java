package main;

//import java.awt.Dimension;
//import java.awt.Toolkit;

import customclasses.Game;

public class Main {
	/*
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	static int width = (int) screenSize.getWidth();
	static int height = (int) screenSize.getHeight();
	*/
	public static void main(String[] args) {
	
		//Game g = new Game(width, height); 			//erstellen von Game anhand der ausgegebenen screensize von getWidth() und getHeight()
		new Game();
	}
		
	

}
