import java.util.Scanner;
class Vowel
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any charater:");
      char ch=sc.next().charAt(0);
      switch(ch)
        {
          case 'a':
            System.out.println("this is vowel:");
            break;
          case 'e':
            System.out.println("this is vowel:");
            break;
          case 'i':
            System.out.println("this is vowel:");
            break;
          case 'o':
            System.out.println("this is vowel:");
            break;
          case 'u':
            System.out.println("default:");
            break;
        }
    }
  }