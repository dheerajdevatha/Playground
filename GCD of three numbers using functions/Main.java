import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
         Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();

	int m=gcd_of_twonumbers(n1,n2);
      System.out.println(gcd_of_twonumbers(m,n3));
	}

  public static int gcd_of_twonumbers(int n1,int n2)
  {			int min,gcd=0;
    		for(int i=1;i<=n1&&i<=n2;++i)
            {	if(n1%i==0&&n2%i==0)
            	{	 gcd=i;
            	}
            }
   return gcd;
  }
   public static int gcd_of_threenumbers(int m,int n3)
  {			int min,gcd=0;
    		for(int i=1;i<=m&&i<=n3;++i)
            {	if(m%i==0&&n3%i==0)
            	{	 gcd=i;
            	}
            }
   return gcd;
  }
  
}
