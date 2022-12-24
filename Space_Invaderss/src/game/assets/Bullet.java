package game.assets;

import java.util.Scanner;

public class Bullet {
	Integer DAMAGE = 10, x, y, a, b;

	Integer hit() {
		return DAMAGE;
	}

	String display() {
		System.out.print("\nFire: ");

		// char move;

//		Scanner sc = new Scanner(System.in);
//
//		move = sc.next().charAt(0);
//
//		if (move == 'f') {
//			return "|";
//		}
		// Thread.sleep(1000);
		System.out.println();
		return "|";
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public void setDAMAGE(Integer dAMAGE) {
		DAMAGE = dAMAGE;
	}

}
