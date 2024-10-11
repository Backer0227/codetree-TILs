import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean Ok = true;
        for(;a<=b;a++)
        {
            if(a%c == 0)
            {
                Ok = false;
            }
        }

        if(Ok)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}