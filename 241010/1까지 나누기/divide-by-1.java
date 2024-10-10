import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=1;
        for(int i=1 ;i<=n ;i++)
        {
            if((n/i)>1)
            {
                count++;
                n/=i;
            }
            else
            {
                break;
            }
        }
        System.out.print(count);
    }
}