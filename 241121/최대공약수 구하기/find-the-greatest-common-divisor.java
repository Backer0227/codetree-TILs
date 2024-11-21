import java.util.Scanner;

public class Main {
    public static void max(int n, int m)
    {
        int maximum = 101;
        for(int i=1;i<=n;i++)
        {
            if(n % i == 0 && m % i == 0)
            {
                maximum = i;
            }
        }
        System.out.print(maximum);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        max(n,m);
    }
}