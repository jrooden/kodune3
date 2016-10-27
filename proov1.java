 import java.util.*;
public class proov1{
		public static void main(String[] arg){
			syyriast s1=new syyriast(30, 5, 8, 12000);
			
			
			somaaliast so1=new somaaliast(130, 15, 35, 12000);
			
			
			List<kasmahub> linnad=new ArrayList<kasmahub>();
			linnad.add(s1);
			linnad.add(so1);
		
			for(kasmahub k: linnad){
			if(k.arvuta()<1){
				System.out.println("rahvaarv:"+k.rahvaarv+"Pagulasi tulemas:"+k.pagulased()+" see kogus mahub ära");
				
			}
			else{
				System.out.println("rahvaarv:"+k.rahvaarv+"Pagulasi tulemas:"+k.pagulased()+" see kogus ei mahu ära");
				
			}
			}
		
	}
}