import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();

	int m=greatest_of_twonumbers(n1,n2);
      System.out.println(greatest_of_threenumbers(m,n3));
    }
  	public static int greatest_of_twonumbers(int n1,int n2)
    {		int m;
      		if(n1>n2)
    			 m=n1;
     		else
       			m=n2;
     		
     	return m;
    }
    	public static int greatest_of_threenumbers(int m,int n3)
        {		if(m>n3)
          			return m;
         		else
                  return n3;
        }
  
 
}