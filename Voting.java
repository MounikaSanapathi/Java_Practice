import java.util.Scanner;
class Voting
  {
    public static void main(String args[])
    {
      int age;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter person age");
      age=sc.nextInt();
      if(age>=20)
      {
        System.out.println("valid for vote");
      }
      else
      {
        System.out.println("invalid");
      }
    }
  } 