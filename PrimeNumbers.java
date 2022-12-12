//program to find given number is primenumber are not
public class PrimeNumbers
{
public static void main(String args[])
{
int n=7;
boolean flag=false;
for(int i=2;i<n;i++)
{
if(n%i==0)
{
flag=true;
}
}
if(flag)
{
System.out.println(n+" is not a prime number");
}
else
{
System.out.println(n+" is prime number");
}

}
}
