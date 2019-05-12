import java.util.Scanner;
class Main{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
      int n;
      int i,p,r;
      int sum=0;
      int s;
      n=sc.nextInt();
      s=n;
      while(n!=0)
      {	i=1;
       p=1;
       r=n%10;
       while(i<=r)
       {	p=p*i;
        i++;
       }
       sum=sum+p;
       n=n/10;
      }
      if(sum==s)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}
        
    
