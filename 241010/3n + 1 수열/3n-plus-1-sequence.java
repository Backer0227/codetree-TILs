import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        
        while(N != 1)
        {
            if(N%2 == 0)
            {
                N/=2;
                count++;
            }
            else if(N%2 != 0)
            {
                N = N*3+1;
                count++;
            }
        }
        System.out.print(count);
    }
}