package ie.itcarlowlab9q2;

public class HGV extends RoadVehicle{
	private int cargo;

	public HGV(){ 	
		this(0,0,0);	
	}

	public HGV(int c, int w, int p){ 
		super(w, p);
		setCargo(c);
	}

	public void setCargo(int size){
		cargo = size;
		}

	public int getCargo(){
		return cargo;
		}	
	
	//misc methods 
	public void calculateDuty() {  //this is an implementation
		System.out.println("HGV Tax is: " + 220 * HGVTAXRATE);
		}
		
}//end class 