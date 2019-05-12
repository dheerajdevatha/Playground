import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int list[] = new int[n];
for(int index = 0; index < n; index++)
{
list[index] = sc.nextInt();
  }
    printbatch(list,n);
  }
  public static void printbatch(int list[],int n)
  {			boolean isperfect=true;
   			int batchsum=list[0]+list[1]+list[2];
   			for(int i=3;i<n;i=i+3)
            {			
              		int c_b_s=list[i]+list[i+1]+list[i+2];
              		if(c_b_s!=batchsum)
                    {isperfect=false;
                    }
            }
   			if(isperfect==true)
              System.out.println("Perfect Batch");
   			else
              System.out.println("Not a Perfect Batch");
  }
}