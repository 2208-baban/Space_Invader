package com.game.assets;

import java.util.Scanner;

public class Player {
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	Avatar AV;
	Bullet bullet;
	Integer n=17,m=24,x,y,a,b;
	public Player(Integer WIDTH,Integer HEIGHT,String NAME){
		AV=new Avatar( WIDTH, HEIGHT, NAME);
		bullet=new Bullet();
		}
	void fire() {

	}
	void hit() {
		
	} 
	public void move(String arr[][],Integer w,Integer h){
		arr[n][m]="O";
		//System.out.println("\tSCORE:"+ score);
		for(x=0;x<w;x++) {
			for(y=0;y<h;y++) {
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}
		Scanner sc= new Scanner(System.in);
		char move;
		while(true) {
			System.out.print("\nEnter a move: ");
			move=sc.next().charAt(0);
			
			if (move=='a'){
				m--;
				arr [n][m+1]=" ";
				bullet.display(arr, w, h);
				if(m==0) {
					System.out.println("Game Over.");
					break;
				}
				}

			
			if (move=='d')
			{
				bullet.display(arr, w, h);
				m++;
				arr [n][m-1]=" ";
				if(m==w) {
					System.out.println("Game Over.");
					break;
				}
			}

for(int i=0; i<w; i++) {
	System.out.println();
}

			arr[n][m]="O";
		//	System.out.println("\tSCORE:" +score);
			for(x=0;x<w;x++) {
				for(y=0;y<h;y++) {
					System.out.print(arr[x][y]+" ");
				}
				System.out.println();
			}
		}
	  }
	  
	
	void display(){
		AV.display();
	}
}
