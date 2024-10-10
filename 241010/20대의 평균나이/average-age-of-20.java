import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;
        while(true)
        {
            int a = sc.nextInt();
            if (a > 19 && a < 30)
            {
                sum += a;
                count ++;
            }
            else
            {
                break;
            }
        }
        double avg = ((double)sum)/count;
        System.out.printf("%.2f",avg);
    }
}