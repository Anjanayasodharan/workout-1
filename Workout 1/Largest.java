import java.util.Scanner;
public class Largest
{
public static void main(String[] args)
{
int a,b,c,largest;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the First number");
a=sc.nextInt();
System.out.println("Enter the Second number");
b=sc.nextInt();
System.out.println("Enter the Third number");
c=sc.nextInt();
largest=c>(a>b?a:b)?c:((a>b)?a:b);
System.out.println("The largest number is"+largest);
}
}