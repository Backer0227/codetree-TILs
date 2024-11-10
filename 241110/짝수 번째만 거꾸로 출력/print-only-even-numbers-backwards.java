import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String N = sc.next();

        for(int i=N.length()-1;i>=0;i--)
        {
            if(i%2 != 0)
            {
                System.out.print(N.charAt(i));
            }
        }

    }
}