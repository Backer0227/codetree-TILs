import java.util.Scanner;

public class Main {
    public static int recursion(int N)
    {
        if(N == 1)
        {
            return 0;
        }

        if(N%2 == 0)
        {
            return recursion(N/2)+1;
        }
        else
        {
            return recursion(N/3)+1;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(recursion(N));


    }
}