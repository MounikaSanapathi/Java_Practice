class Evensum
  {
    public static void main(String args[])
    {
      int number,i,evensum=0;
      System.out.println("please enter any number:");
      for(i=1;i<=number;i++)
        {
          if(i%2==0)
          {
            evensum=evensum+i;
          }
        }
      System.out.println("\n the sum of even numbers upto" + number + evensum);
    }
  }