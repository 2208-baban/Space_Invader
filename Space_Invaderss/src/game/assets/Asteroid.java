package game.assets;

import java.util.Scanner;

public class Asteroid extends Enemy {
	Integer i = 1;
	Avatar AV;
	String name;
	Player player;

	public Asteroid(Integer WIDTH, Integer HEIGHT, Integer DAMAGE, String NAME) {
		AV = new Avatar(WIDTH, HEIGHT);
		// name=NAME;
	}

	@Override
	protected void hit() {
		// TODO Auto-generated method stub
		super.hit();
	}

	@Override
	protected void move(Integer w, Integer h, String arr[][]) {
		// super.move(w, h, arr);
		// TODO Auto-generated method stub
		player=new Player();
		super.move();
		
		Bomb bo = null;
		
		for (int x = 0; x < w; x++) {
			for (int y = 0; y < h; y++) {

				if (x == 2 && y > 42 && y < 48) {
					arr[x][y] = "A";
				}

				else if (x == 4 && y > 40 && y < 47) {
					arr[x][y] = "A";
				}

			}
		}
		
	}

	

	public void display() throws InterruptedException {
		Space space = new Space(50, 20);
		space.render();
		AV.display();
	}
}
