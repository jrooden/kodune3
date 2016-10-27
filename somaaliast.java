public class somaaliast extends kasmahub{
	
	int mehed, naised, lapsed;
	
	public somaaliast(int mehed, int naised, int lapsed, int rahvaarv){
		super(rahvaarv);
		this.mehed=mehed;
		this.naised=naised;
		this.lapsed=lapsed;
	}
	public int pagulased(){
		return (int) Math.round((mehed+naised+lapsed)*0.8);
		
	}
} 