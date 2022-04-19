import java.util.Scanner;
class Even
  {
    public static void main(String args[])
    {
      int d;
      Scanner sc=new Scanner(System.in);
      System.out.println("the given num even or odd");
      d=sc.nextInt();
      if(d<=3)
      {
        System.out.println("even");
      }
      else
      {
        System.out.println("odd");
      }
    }
  }