public abstract class kasmahub{
	int rahvaarv;
	public kasmahub(int uusRahvaarv){
		rahvaarv=uusRahvaarv;
	}
	public abstract int pagulased();
	public int arvuta(){
		return pagulased()*100/rahvaarv;
		
		
	}
	
} 