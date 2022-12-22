package com.game.assets;

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
	void move() {
		
	}
	void display(){
		AV.display();
	}
}
