import java.util.Scanner;

public class Main {
    public static int plus(int a, int c)
    {
        return a+c;
    }
    public static int minus(int a, int c)
    {
        return Math.abs(a-c);
    }
    public static int divide(int a, int c)
    {
        return (int)a/c;
    }
    public static int multiple(int a, int c)
    {
        return a*c;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        int result = 0;
        boolean pass = true;
        switch(o)
        {
            case '+':
            {
                result = plus(a,c);
                break;
            }
            case '-':
            {
                result = minus(a,c);
                break;
            }
            case '/':
            {
                result = divide(a,c);
                break;
            }
            case '*':
            {
                result = multiple(a,c);
                break;
            }
            default:
            {
                pass = false;
            }
        }
            if(pass)
            {
                System.out.printf("%d %c %d = %d",a,o,c,result);
            }
            else
            {
                System.out.print("False");
            }
        
    }
}