import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i=0;
        if(b>a)
        {
            a*=10;
            System.out.print("0." + a/b);
        }
        else
        {
            System.out.print(a/b + ".");
        }
        while(i <= 18)
        {
        	a %= b;
            a *= 10;
            System.out.print(a/b);
            i++;
        }
    }
}