// * * * * * * * * *
// * * * *   * * * *
// * * *       * * *
// * *           * *
// *               *
// * *           * *
// * * *       * * *
// * * * *   * * * *
// * * * * * * * * *
import java.util.*;
class DiamondInSquare
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        for(int i = 1;i <= num;i++)
        {
            for(int j = 1;j <= 2*num-1;j++)
            {
                if(j == 1|| i == 1 || j == 2*num-1 || j <= num-i+1||j >= num+i-1)
                {
                    System.out.print("*"+" ");
                }
                else
                {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
        for(int i = 2;i <= num;i++)
        {
            for(int j = 1;j <= 2*num-1;j++)
            {
                if(j == 1 || i == num || j == 2*num-1 || j <= i || j >= 2*num-i)
                {
                    System.out.print("*"+" ");
                }
                else
                {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}