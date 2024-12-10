import java.util.Scanner;

public class Main {
    public static int plus(int N)
    {
        if(N < 10)
        {
            return N;
        }
        return plus(N/10) + (N%10);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int sum = 1;
        for(int i=0;i<3;i++)
        {
            int A = sc.nextInt();
            sum *= A;
        }
        System.out.print(plus(sum));
    }
}