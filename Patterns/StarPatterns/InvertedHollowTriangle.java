// * * * * * 
//  *     * 
//   *   * 
//    * * 
//     * 
import java.util.*;
class InvertedHollowTriangle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        for(int i = 1;i <= num;i++)
        {
            for(int j = 1;j < i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j <= (num-i)+1;j++)
            {
                if(i == 1 || j == 1 || j == (num-i+1))
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