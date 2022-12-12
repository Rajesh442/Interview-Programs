public class SumofDigits
{
static int sumofdigit(int num)
{
if(num!=0)
return(num%10+sumofdigit(num/10));
return 0;
} 

public static void main(String args[])
{
int num=153;
int result=sumofdigit(num);
System.out.println("Sum of all digit of "+num+" is "+result);
}
}
