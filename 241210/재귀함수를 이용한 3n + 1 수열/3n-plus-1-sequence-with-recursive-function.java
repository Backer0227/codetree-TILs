import java.util.Scanner;
public class Main {
    public static int count = 0;
    public static int recursion(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        
        if(n % 2 == 0)
        {
            count++;
            recursion(n/2);
        }
        else
        {
            count++;
            recursion(n*3+1);
        }
        return count;
        
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.print(recursion(n));
    }
}