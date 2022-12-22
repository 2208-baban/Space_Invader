package com.game.assets;
public class Asteroid extends Enemy {
	Integer i=1;
	Avatar AV;
	String name;
	public Asteroid(Integer WIDTH,Integer HEIGHT,Integer DAMAGE,String NAME){
		AV=new Avatar( WIDTH, HEIGHT, DAMAGE, NAME);
		name=NAME;
	}
	@Override
	protected void hit() {
		// TODO Auto-generated method stub
		super.hit();
	}

	@Override
	protected void move() {
		// TODO Auto-generated method stub
		super.move();
	}
	public void display(){
		Space.render(name);
		AV.display();
	}
}
