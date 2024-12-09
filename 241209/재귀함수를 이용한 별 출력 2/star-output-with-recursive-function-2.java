import java.util.Scanner;

public class Main {
    public static void recursion(int N)
    {
        if(N == 0)
        {
            return;
        }

        for(int i=0;i<N;i++)
        {
            System.out.print("* ");
        }
        System.out.print("\n");
        recursion(N-1);
        for(int i=0;i<N;i++)
        {
            System.out.print("* ");
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        recursion(N);
    }
}