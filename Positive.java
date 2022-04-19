import java.util.Scanner;
class Positive
  {
    public static void main(String args[])
    {
      int i;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number");
      i=sc.nextInt();
      if(i>=20)
      {
        System.out.println("positive");
      }
      else
      {
        System.out.println("negative");
      }
 
    }
  }
