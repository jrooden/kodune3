public class syyriast extends kasmahub{
	int mehed, naised, lapsed;
	public syyriast(int mehed, int naised, int lapsed, int rahvaarv){
		super(rahvaarv);
		this.mehed=mehed;
		this.naised=naised;
		this.lapsed=lapsed;
	}
	public int pagulased(){
		return mehed+naised+lapsed;
		
	}
}