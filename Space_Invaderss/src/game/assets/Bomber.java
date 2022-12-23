package game.assets;

public class Bomber extends Enemy{
	Avatar AV;
	public Bomber(Integer WIDTH,Integer HEIGHT,String NAME){
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
				
				if(x==2 && y>22 && y<30)
				{
					arr[x][y]="B";
				}

				else if(x==4 && y>23 && y<32)
				{
					arr[x][y]="B";
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
