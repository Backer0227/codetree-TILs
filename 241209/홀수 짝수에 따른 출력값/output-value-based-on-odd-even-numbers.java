import java.util.Scanner;

public class Main {
    public static int recursion(int N)
    {
        if(N == 1)
        {
            return 1;
        }
        else if(N == 2)
        {
            return 2;
        }

        return N+recursion(N-2);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print(recursion(N));
    }
}