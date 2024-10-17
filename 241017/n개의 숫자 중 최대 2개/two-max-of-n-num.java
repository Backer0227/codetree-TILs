import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max1=-2147483648,max2=-2147483647;
        for(int i=0;i<n;i++)
        {
            int a = sc.nextInt();
            if(max2 <= a)
            {
                max2 = a;
                if(max1 <= max2)
                {
                int temp = max1;
                max1 = max2;
                max2 = temp;
                }
            }
        }
        System.out.print(max1 +" " +max2);
    }
}