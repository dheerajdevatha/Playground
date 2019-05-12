import java.util.*;
import java.math.*;

class Main{ 
  public static void power(int base,int exponent)
  {	System.out.println(Math.pow(base,exponent));
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int base=sc.nextInt();
      int exponent=sc.nextInt();
        	power(base,exponent);

	}
}