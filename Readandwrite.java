//program to read a file and write the same content in another file
import java.io.*;
public class Readandwrite
{
public static void main(String args[])
{
try
    {
    //reading a file and copy the content from the file
    FileReader fr=new FileReader("/home/rajesh/Documents/input.txt");
    int i;
    String copy="";
while((i=fr.read())!=-1)
    {
    copy=copy+((char)i);
    }
    FileWriter fw=new FileWriter("/home/rajesh/Documents/ReadandwriteOperation.txt");
    fw.write(copy);
    fw.close();
    System.out.println("Both Read and Write Operation done");
}
catch(Exception e)
{
e.printStackTrace();
}

}
}
