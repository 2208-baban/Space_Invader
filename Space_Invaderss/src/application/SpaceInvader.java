package application;


//import com.game.assets.Asteroid;

import game.assets.*;

public class SpaceInvader {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Asteroid a=new Asteroid(12, 12, 20, "A1") ;
		//Player player=new Player(12, 12, "P1");
		//Shooter shoot=new Shooter(12, 12, "S1");
		//player.move();
		//shoot.move();
		//a.display();
		Space space=new Space(20,50);
		space.display();
		space.render();
}
}
