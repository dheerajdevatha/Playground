import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {	a[i]=sc.nextInt();
      }
      int se1=sc.nextInt();
      int se2=sc.nextInt();
      int el1=-1;
      int el2=-1;
      for(int i=0;i<n;i++)
      {		
        	if(se1==a[i])
            {	el1=i;
            }
        if(se2==a[i])
        {		
          	el2=i;
        }
      }
      System.out.println(el1);
      System.out.println(el2);
      
    }
}