//swap 2 numbers with temporary variable and swap with out temporary variable
public class Swap2num
{
int a=6;
int b=5;
int swapwithtemp()
{
int temp=a;
a=b;
b=temp;
System.out.println("After swaping with temporary variable");
System.out.println("value of a is "+a);
System.out.println("value of b is "+b);
return a;
}
int swapwotemp()
{
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swaping without temporary variable");
System.out.println("value of a is "+a);
System.out.println("value of b is "+b);
return a;
}

public static void main(String args[])
{
Swap2num swap= new Swap2num();
swap.swapwithtemp();
swap.swapwotemp();
}
}
