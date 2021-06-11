public class Throws{
	static void Digit(int n) throws ArithmeticException {
    	if (n > 10) {
      		throw new ArithmeticException("NO, it is not a digit.");
    	}
    	else {
      		System.out.println("YES, it is a digit.");
    	}
  	}

  	public static void main(String[] args) {
    		Digit(15);
  	}
}