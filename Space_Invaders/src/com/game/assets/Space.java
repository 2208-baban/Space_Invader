package com.game.assets;

import java.util.Scanner;

public class Space {
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
