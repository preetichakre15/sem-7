import java.util.Scanner;
public class Fibonacciiteration{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter a Number :");
int n=sc.nextInt();
System.out.println("Print Fibonacci Upto "+ n+" numbers");
       long startTime=System.nanoTime();
System.out.println("Using Iteration:");
for(int i=1;i<=n;i++)
{
System.out.println(" fibonacci of "+ i +" is "+fibonacci(i)+" ");
}
        long endTime=System.nanoTime();
	long	runningTime=(endTime-startTime);
        System.out.println("Execution time for Iteration is : " + runningTime + "ns");

}
public static int fibonacci(int n){
if(n==1||n==2)
{
return 1;
}
int fibo=1,fibo2=1,fibonacci=1;
for(int i=3;i<=n;i++)
{
fibonacci=fibo+fibo2;
fibo=fibo2;
fibo2 = fibonacci;
}
return fibonacci;
}
}
