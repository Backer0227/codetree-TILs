import java.util.Scanner;

public class Main {
    public static int A = 1;
    public static int recursion(int N)
    {
        if (N == 0)
        {
            return 2;
        }
        if(N == 1)
        {
            return 4;
        }
        
        return (recursion(N-2)*recursion(N-1))%100;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(recursion(N-1));
    }
}