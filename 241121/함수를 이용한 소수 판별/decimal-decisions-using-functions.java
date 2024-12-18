import java.util.Scanner;

public class Main {
    public static boolean isDecimal(int n)
    {
        if (n == 1)
        {
            return false;
        }
        int count = 0;
        for(int i=1;i<=n;i++)
        {
            if(n%i == 0)
            {
                count++;
            }
            if(count == 3)
            {
                return false;
            }
        }
        return true;
    }
    public static int sum(int a, int b)
    {
        int sum = 0;
        for(int i=a;i<=b;i++)
        {
            if(isDecimal(i))
            {
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(sum(a,b));
    }
}