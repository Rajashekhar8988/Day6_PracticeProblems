package bridgelabz.javapractice.Day6Assignment;

import java.util.Scanner;
class ReverseNumber
{
   public static void main(String args[])
   {
      int num=0;
      int reversenum =0;
      System.out.println("enter any number :");
      Scanner in = new Scanner(System.in);
      num = in.nextInt();
      while( num != 0 )
      {
          reversenum = reversenum * 10;
          reversenum = reversenum + num%10;
          num = num/10;
      }
      System.out.println("Reverse of input number is: "+reversenum);
   }
}
