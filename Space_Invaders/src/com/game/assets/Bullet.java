package com.game.assets;

public class Bullet {
<<<<<<< HEAD
	Integer DAMAGE=10;
	 Integer hit() {
		return DAMAGE;
	}
	void display() {
		
=======
	Integer DAMAGE=10,x,y,a,b;
	 Integer hit() {
		return DAMAGE;
	}
	void display(String arr[][],Integer w,Integer h) {
		for(x=0;x<w;x++) {
			for(y=0;y<h;y++) {
				arr[a][b]="|";
				System.out.print(arr[x][y]+" ");
			//	Thread.sleep(1000);
			}
			System.out.println();
		}
>>>>>>> refs/heads/develop
	}
	public void setDAMAGE(Integer dAMAGE) {
		DAMAGE = dAMAGE;
	}
	
}
