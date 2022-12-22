package com.game.assets;

<<<<<<< HEAD
	protected void hit() {
	} 
	protected void move() {
		
	}
}
=======
public abstract class Enemy  {
	
	protected void hit() {
		
	} 
	public void move(String arr[][],Integer w,Integer h){
		for(int x=0;x<w;x++) {
			for(int y=0;y<h;y++) {
				//border top and bottom
				if(x==0 || x==w-1)
				{
					arr[x][y]="#";
				}
				//border left and right
				else if(y==0 || y==h-1)
				{
					arr[x][y]="#";
				}
				else if(x==2 && y>8 && y<15)
				{
					arr[x][y]="S";
				}
				else if(x==2 && y>20 && y<33)
				{
					arr[x][y]="B";
				}
				else if(x==4 && y>9 && y<16)
				{
					arr[x][y]="S";
				}
				else if(x==4 && y>23 && y<35)
				{
					arr[x][y]="B";
				}
				else{
					arr[x][y]=" ";
				}	
			}
		}
	  }
	public void move() {
		// TODO Auto-generated method stub
		
	}
	}

>>>>>>> refs/heads/develop
