package com.game.assets;

<<<<<<< HEAD
import java.io.IOException;
=======
import java.util.Scanner;
>>>>>>> refs/heads/develop

public class Space {
<<<<<<< HEAD
	Integer WIDTH, HEIGHT;

	public static void render(String name) {
		Integer x = 20; // Initial x position of the object
		Integer y = 0; // Initial y position of the object
		Integer speed = 2; // Speed of the object
		for (int i = 0; i < 10; i++) {
			// Clear the terminal screen
			clear();
			// Set the cursor position to the new position of the object
			System.out.print("\033["+ y+ x);
			// Print the object at its current position
			System.out.print(name+" ");
			// Move the object
			x -= speed;
			// y += speed;
			// Wait for a short time before updating the object's position again
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void clear() {
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
	}
	void display() {

	}
=======
  		public Integer WIDTH,HEIGHT;
  		public String arr[][];
		Player player=new Player();
		Enemy enemy=new Enemy() {};
  		//public Integer x,y;
  	//	public Integer a,b;
  		//public Integer score;
	public Space(Integer Width,Integer Height){
		WIDTH=Width;
		HEIGHT=Height;
		arr= new String [WIDTH][HEIGHT];

	}
	
	public void render() throws InterruptedException {
			enemy.move(arr, WIDTH, HEIGHT);
			player.move(arr, WIDTH, HEIGHT);
}
		  
	public void display() {
	
		}
>>>>>>> refs/heads/develop

	public Integer getWIDTH() {
		return WIDTH;
	}

	public void setWIDTH(Integer wIDTH) {
		WIDTH = wIDTH;
	}

	public Integer getHEIGHT() {
		return HEIGHT;
	}

	public void setHEIGHT(Integer hEIGHT) {
		HEIGHT = hEIGHT;
	}

}
