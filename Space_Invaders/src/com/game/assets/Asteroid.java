package com.game.assets;
public class Asteroid extends Enemy {
	Integer i=1;
	Avatar AV;
	String name;
	public Asteroid(Integer WIDTH,Integer HEIGHT,Integer DAMAGE,String NAME){
		AV=new Avatar( WIDTH, HEIGHT);
		//name=NAME;
	}
	@Override
	protected void hit() {
		// TODO Auto-generated method stub
		super.hit();
	}

	@Override
	public void move()  {
		// TODO Auto-generated method stub
		super.move();
	}
	public void display() throws InterruptedException{
		Space space=new Space(50, 20);
		space.render();
		AV.display();
	}
}
