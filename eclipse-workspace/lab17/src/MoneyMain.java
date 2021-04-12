
public class MoneyMain {
   
   static String[] dataSource =  {"B5","Q","B20","Q", "P", "N","D"};
   static Money[] wallet = new Money[dataSource.length];
   
   public static void main (String[] args) {
            
      for (int i=0;i<dataSource.length;i++){
         char dataItem = dataSource[i].charAt(0); //return the first character in the string
         if (dataItem == 'B') {  //Bill object
            int billValue= Integer.parseInt(dataSource[i].substring(1));
            wallet[i]= new Bill(billValue);
         }   
         else { //Coin type
            if (dataItem == 'Q')
               wallet[i]=new Quarter();
            if (dataItem == 'P')
            	wallet[i] =new Penny();
            if (dataItem == 'N')
            	wallet[i] = new Nickel();
            if (dataItem == 'D')
            	wallet[i]= new Dime();
         }
         }
      printWallet();
      sumWallet();
   }
   public static void printWallet () {
      for (int i=0;i<wallet.length;i++) {
    	 System.out.println(wallet[i]);
    	  /*
         if (wallet[i] instanceof Bill)
            System.out.println("$ "+((Bill)wallet[i]).getValue()+".00");
         else // Coin type
            System.out.println(wallet[i]);
            */
      }
   }
   
   public static void sumWallet() {
	   float sum =0;
	   for(int i=0; i<wallet.length; i++) {
		   if(wallet[i] instanceof Bill)
			   sum+=((Bill)wallet[i]).getValue();
		   else 
			   sum+=((Coin)wallet[i]).getValue()/100f;
	   }
	   System.out.println("sum: "+sum);
   }
   
}
