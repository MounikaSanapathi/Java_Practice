class Fristndlast
  {
    public static void main(String args[])
    {
    int number=502356997;
    int fristdigit=0;
    int lastdigit=0;
    lastdigit=number%10;
    System.out.println("last digit:"+lastdigit);
    while(number!=0)
      {
        fristdigit=number%10;
        number/=10;
      }
    System.out.println("fristdigit:"+fristdigit);
    }
  }