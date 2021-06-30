import java.util.*;
class Harshad
{
public static void main(String args[ ])
{
Scanner sc=new Scanner(System.in);
int n,r,s=0,x;
System.out.println("Enter n value : ");
n=sc.nextInt();
x=n;
while(n!=0)
{
r=n%10;
s=s+r;
n=n/10;
}
if(x%s==0)
System.out.println(x+" is a harshad number");
else
System.out.println(x+" is not a harshad number");
}
}