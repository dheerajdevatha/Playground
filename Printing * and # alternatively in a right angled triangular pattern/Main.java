import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      Scanner sc=new Scanner(System.in);
      int i,j;
      int n=sc.nextInt();
      int t=0;
      for(i=0;i<n;i++)
      {		for(j=0;j<=i;j++)
      		{			if(t==0)
           			 { System.out.print("*");
             			t=1;
            		}
            		 else
             		{	System.out.print("#");
                    	 t=0;     
             		}
            } 
             System.out.println();
      }
      sc.close();
                           
         
    }
}