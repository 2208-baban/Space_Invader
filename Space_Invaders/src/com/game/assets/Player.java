package com.game.assets;

import java.util.Scanner;

public class Player {
	Avatar AV;
	Bullet b;
	public Player(Integer WIDTH,Integer HEIGHT,String NAME){
		AV=new Avatar( WIDTH, HEIGHT, NAME);
		b=new Bullet();
		}
	void fire() {
		
	}
	void hit() {
		
	} 
	public void move(){
	
	  }
	  
	
	void display(){
		AV.display();
	}
}
