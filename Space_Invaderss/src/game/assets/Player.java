package game.assets;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	Avatar AV;
	//ArrayList <Bullet> bullets = new ArrayList<Bullet>();
	Bullet bullet;
	Integer n = 17, m = 24, x, y, a, b;

	public Player(Integer WIDTH, Integer HEIGHT, String NAME) {
		AV = new Avatar(WIDTH, HEIGHT, NAME);
		bullet = new Bullet();
	}

	Bullet fire() {
		Bullet bullet=new Bullet();
		bullet.setX(this.m);
		bullet.setY(this.n-1);
		return bullet;
	}

	void hit() {

	}

	public void move(String arr[][], Integer w, Integer h) {
		
	}

	void display() {
		AV.display();
	}
}
