import java.util.Scanner;
class leap
{
public static void main(String args[])
  {
    Scanner myobj=new Scanner(System.in);
    System.out.println("enter a year:");
    int year =myobj.nextInt();
    System.out.println(" enter a number is: "+year);
    if (year%4==0)
    {
    System.out.println(" It is a leap year");
    }
    else
    {
    System.out.println(" It is not a leap year");
    }
  }
}