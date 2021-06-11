class Finally{  
	public static void main(String args[]){  
  	try{  
   		int n = 10/5 ;  
   		System.out.println(n);  
  	}  
  	catch(NullPointerException e){System.out.println(e);}  
  	finally{System.out.println("Entered Finally block.");}
  	System.out.println("Finally code Executed..");
  	}  
}