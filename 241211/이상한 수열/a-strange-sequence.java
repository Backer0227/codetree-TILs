import java.util.Scanner;

public class Main {
    public static int count = 0;
    public static int recursion(int N)
    {
        if(N == 1)
        {
            return 1;
        }
        if(N == 2)
        {
            return 2;
        }

        return recursion(N/3)+recursion(N-1);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(recursion(N));
    }
}