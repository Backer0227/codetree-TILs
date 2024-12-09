import java.util.Scanner;

public class Main {
    public static void func1(int n,int a)
    {
        if (n==0)
        {
            System.out.print("\n");
            return;
        }

        System.out.print(a-n+1+" ");
        func1(n-1,a);
    }
    public static void func2(int n)
    {
        if(n==0)
        {
            System.out.print("\n");
            return;
        }

        System.out.print(n+" ");
        func2(n-1);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        func1(N,N);
        func2(N);
    }
}