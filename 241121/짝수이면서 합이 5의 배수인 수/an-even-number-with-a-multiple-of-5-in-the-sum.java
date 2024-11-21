import java.util.Scanner;

public class Main {
    public static boolean evenFiveMul(int n)
    {
        String nString = Integer.toString(n);
        int A = nString.charAt(0)-'0';
        int B = nString.charAt(1)-'0';
        return n%2 == 0 && ((A+B)%5 == 0);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean pass = evenFiveMul(n);
        if(pass)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
        
    }
}