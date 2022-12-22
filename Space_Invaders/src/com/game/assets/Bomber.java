package com.game.assets;

public class Bomber extends Enemy{
	Avatar AV;
	public Bomber(Integer WIDTH,Integer HEIGHT,String NAME){
		AV=new Avatar( WIDTH, HEIGHT, NAME);
	}
	@Override
	protected void hit() {
		// TODO Auto-generated method stub
		super.hit();
	}

	@Override
<<<<<<< HEAD
	protected void move() {
=======
	public void move() {
>>>>>>> refs/heads/develop
		// TODO Auto-generated method stub
		super.move();
	}
	void fire() {
		
	}
	void display(){
		AV.display();
	}
}
