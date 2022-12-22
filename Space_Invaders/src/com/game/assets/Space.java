package com.game.assets;

public class Space {
	 private Integer WIDTH,HEIGHT;
	 String arr[][];
		Integer x,y;
		 Integer n=2;
		 Integer m=2;
	public Space(Integer Width,Integer Height) {
		WIDTH=Width;
		HEIGHT=Height;
		arr= new String [WIDTH][HEIGHT];
	}
	
	public void render() {
	//	arr[n][m]="@";
		System.out.println("\tSCORE:");
		for(int x=0;x<WIDTH;x++) {
			for(int y=0;y<HEIGHT;y++) {
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}
		  }
	public void display() {
		
		for(int x=0;x<WIDTH;x++) {
			for(int y=0;y<HEIGHT;y++) {
				//border top and buttom
				if(x==0 || x==WIDTH-1)
				{
					arr[x][y]="#";
				}
				//bordeer left and right
				else if(y==0 || y==HEIGHT-1)
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
				else if(x==17 && y==20 )
				{
					arr[x][y]="P";
				}
				
				else{
					arr[x][y]=" ";
				}
			
				
			}
		}
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
