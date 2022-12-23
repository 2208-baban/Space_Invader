package game.assets;

public class Shooter extends Enemy{
	Avatar AV;
	public Shooter(Integer WIDTH,Integer HEIGHT,String NAME){
		AV=new Avatar( WIDTH, HEIGHT, NAME);
	}

	@Override
	protected void hit() {
		// TODO Auto-generated method stub
		super.hit();
	}

	@Override
		protected void move(Integer w,Integer h,String arr[][]) {
		//	super.move(w, h, arr);
		// TODO Auto-generated method stub
		super.move();
		for(int x=0;x<w;x++) {
			for(int y=0;y<h;y++) {
				
				if(x==2 && y>8 && y<15)
				{
					arr[x][y]="S";
				}

				else if(x==4 && y>9 && y<16)
				{
					arr[x][y]="S";
				}

				}	
			}
		}

	void fire() {
		
	}
	void display(){
		AV.display();
	}
}
