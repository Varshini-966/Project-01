package CharacterPatterns;
import java.util.*;
class Alpha1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        char c = 'A';
        for(int i = 1;i <= num;i++)
        {
            for(int j = 1;j <= i;j++)
            {
                System.out.print(c+" ");
            }
            System.out.println();
            c++;
        }
    }
}