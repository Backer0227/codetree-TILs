import java.util.Scanner;

public class Main {
    public static void func(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.print("HelloWorld\n");
        func(n-1);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        func(N);
    }
}