package game.assets;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	Avatar AV;
	ArrayList<Bullet> bullets = new ArrayList<Bullet>();
	Bullet bullet;
	Integer n = 17, m = 24, x, y, a, b;
	char move=' ';

	public Player(Integer WIDTH, Integer HEIGHT, String NAME) {
		AV = new Avatar(WIDTH, HEIGHT, NAME);
	
	}
	
	Bullet fire() {
		Bullet bullet = new Bullet();
		bullet.setX(this.m);
		bullet.setY(this.n - 1);
		return bullet;
	}

	void hit() {

	}

	public void move(String arr[][], Integer w, Integer h) {
		arr[n][m] = "O";
		// System.out.println("\tSCORE:"+ score);
		for (int x = 0; x < w; x++) {
			for (int y = 0; y < h; y++) {
				System.out.print(arr[x][y] + " ");
			}
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		
		Bullet bu = null;
		while (true) {
			System.out.print("\nEnter a move: ");
			move = sc.next().charAt(0);

			if (move == 'a') {
				m--;
				arr[n][m + 1] = " ";
				// bullet.display(arr, w, h);
//				if(m==0) {
//					System.out.println("Game Over.");
//					break;
//				}
			}

			if (move == 'd') {
				// bullet.display(arr, w, h);
				m++;
				arr[n][m - 1] = " ";
//				if(m==w) {
//					System.out.println("Game Over.");
//					break;
//				}
			}
			if (move == 'f') {
				Bullet bullet = fire();
				bullets.add(bullet);
			}

			for (int i = 0; i < w; i++) {
				System.out.println();
			}

			for (Bullet b : bullets) {
				int x = b.getX();
				int y = b.getY();
				arr[y][x] = "|";
				arr[y + 1][x] = " ";
				b.setY(y - 1);
				if (b.getY() == 0) {
					arr[y][x] = " ";
					bu = b;
				}
			}
			if (bu != null)
				bullets.remove(bu);
			arr[n][m] = "O";
			// System.out.println("\tSCORE:" +score);
			for (int x = 0; x < w; x++) {
				for (int y = 0; y < h; y++) {
					System.out.print(arr[x][y] + " ");
				}
				System.out.println();
			}
			Integer f = 0;
			for (int x = 0; x < w; x++) {
				for (int y = 0; y < h; y++) {
					if (arr[x][y] == "S" || arr[x][y] == "B" || arr[x][y] == "A") {
						f = 1;
						break;
					}

				}

			}
			if (f == 0) {
				System.out.println("YOU WON");
				return;
			}
			
			

		}
	}

	void display() {
		AV.display();
	}
}
