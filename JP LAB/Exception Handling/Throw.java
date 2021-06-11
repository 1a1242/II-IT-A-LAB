public class Throw{  
	static void digit(int n){  
	if(n>10){  
		throw new ArithmeticException("Not a digit.");
	}  
     	else{  
      		System.out.println("Digit.");
	}
   	}  
   	public static void main(String args[]){  
      		digit(13);  
      		System.out.println("Succesfully thrown a exception.");  
  	}  
}