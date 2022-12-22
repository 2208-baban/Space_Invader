package game.assets;

import java.util.ArrayList;
import java.util.Scanner;

public class Space {
  		public Integer WIDTH,HEIGHT;
  		public String arr[][];
		Player player=new Player();
		Enemy enemy=new Enemy() {};
		//Bullet bullet =new Bullet();
		ArrayList <Bullet> bullets = new ArrayList<Bullet>();
  		//public Integer x,y;
  	//	public Integer a,b;
  		//public Integer score;
	public Space(Integer Width,Integer Height){
		WIDTH=Width;
		HEIGHT=Height;
		arr= new String [WIDTH][HEIGHT];

	}
	
	public void render() throws InterruptedException {
			enemy.move(arr, WIDTH, HEIGHT);
			//player.move(arr, WIDTH, HEIGHT);
			
		arr[player.n][player.m] = "O";
		
		// System.out.println("\tSCORE:"+ score);
		for (int x = 0; x < WIDTH; x++) {
			for (int y = 0; y < HEIGHT; y++) {
				System.out.print(arr[x][y] + " ");
			}
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		char move;
		Bullet bu=null;
		while (true) {
			System.out.print("\nEnter a move: ");
			move = sc.next().charAt(0);
			
			
			if (move == 'a') {
				player.m--;
				arr[player.n][player.m + 1] = " ";
				// bullet.display(arr, w, h);
//				if(m==0) {
//					System.out.println("Game Over.");
//					break;
//				}
			}

			if (move == 'd') {
				// bullet.display(arr, w, h);
				player.m++;
				arr[player.n][player.m - 1] = " ";
//				if(m==w) {
//					System.out.println("Game Over.");
//					break;
//				}
			}
			if(move == 'f') {
				Bullet bullet= player.fire();
				bullets.add(bullet);
				}

			for (int i = 0; i < WIDTH; i++) {
				System.out.println();
			}
			
			for (Bullet b : bullets )
			{
				int x=b.getX();
				int y =b.getY();
				arr[y][x]="|";
				arr[y+1][x]=" ";
				b.setY(y-1);
				if(b.getY()==0)
				{
					arr[y][x]=" ";
					bu=b;
				}
			}
			if(bu!=null)
				bullets.remove(bu);
			arr[player.n][player.m] = "O";
			// System.out.println("\tSCORE:" +score);
			for (int x = 0; x < WIDTH; x++) {
				for (int y = 0; y < HEIGHT; y++) {
					System.out.print(arr[x][y] + " ");
				}
				System.out.println();
			}
			Integer f=0;
			for (int x = 0; x < WIDTH; x++) {
				for (int y = 0; y < HEIGHT; y++) {
					if(arr[x][y]=="S"||arr[x][y]=="B") {
						f=1;
						break;
					}
						
				}
				
			}
			if(f==0) {
				System.out.println("YOU WON");
				return;
			}
			
		}
		}
		  
	public void display() {
	
		}

	public Integer getWIDTH() {
		return WIDTH;
	}

	public void setWIDTH(Integer wIDTH) {
		WIDTH = wIDTH;
	}

	public Integer getHEIGHT() {
		return HEIGHT;
	}

	public void setHEIGHT(Integer hEIGHT) {
		HEIGHT = hEIGHT;
	}

}
