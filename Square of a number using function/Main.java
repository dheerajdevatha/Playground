import java.util.Scanner;
class Main
{	public  static int  square(int num)
{	
  
 	return num*num;
}
	public static void main (String[] args)
    {	
	 // Type your code here   
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=square(n);
      System.out.println(m);
      
	} 
}