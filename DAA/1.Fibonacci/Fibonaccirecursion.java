import java.util.Scanner;
public class Fibonaccirecursion{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter a Number :");
int n=sc.nextInt();
System.out.println("Print Fibonacci Upto "+ n+" numbers");
System.out.println("Using Recursion :");
 long startTime=System.nanoTime();
for(int i=1;i<=n;i++)
{
System.out.println(" fibonacci of "+ i +" is "+fibonacci2(i)+" ");
}
        long endTime=System.nanoTime();
	long	runningTime=(endTime-startTime);
        System.out.println("Execution time for Recursion is : " + runningTime + "ns");

}
public static int fibonacci2(int n){
if(n==1 || n==2)
{
return 1;
}
return fibonacci2(n-1)+fibonacci2(n-2);
}
}


