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
	Shooter shooter=new Shooter(HEIGHT, HEIGHT, "S");
	Bomber bomber=new Bomber(WIDTH, HEIGHT, "B");
	Asteroid asteroid=new Asteroid(WIDTH, HEIGHT,5, "A");
	public void render() throws InterruptedException {
		for(int x=0;x<WIDTH;x++) {
			for(int y=0;y<HEIGHT;y++) {
				//border top and bottom
				if(x==0 || x==WIDTH-1)
				{
					arr[x][y]="#";
				}
				//border left and right
				else if(y==0 || y==HEIGHT-1)
				{
					arr[x][y]="#";
				}
				else{
					arr[x][y]=" ";
				}
				shooter.move(WIDTH, HEIGHT, arr);
				bomber.move(WIDTH, HEIGHT, arr);
				asteroid.move(WIDTH, HEIGHT, arr);	
			}
		}
			enemy.move(arr, WIDTH, HEIGHT);
			player.move(arr, WIDTH, HEIGHT);
			
		
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
