import java.util.Scanner;

public class Main {
    public static void max(int n, int m)
    {
        int tempn = n;
        while(true)
        {
            if(tempn%m == 0)
            {
                System.out.print(tempn);
                break;
            }
            tempn+=n;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        max(n,m);
    }
}