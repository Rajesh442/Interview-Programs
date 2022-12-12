//find second max element in an array
public class SecondMaxelement
{
public static void main(String args[])
{
int a[]={7,4,10,2,4,6};
//assending sorting
for(int i=0;i<a.length;i++)
  {
  int temp=0;
  for(int j=i+1;j<a.length;j++)
    {
    if(a[i]>a[j])
      {
      temp=a[i];
      a[i]=a[j];
      a[j]=temp;
      }
    }
  }
System.out.println("sencond Max element in an array is "+a[a.length-2]);
}
}
