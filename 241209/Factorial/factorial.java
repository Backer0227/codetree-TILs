import java.util.Scanner;

public class Main {
    public static int factorial(int n)
    {
        if(n == 1 || n == 0)
        {
            return 1;
        }

        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.print(factorial(n));

    }
}