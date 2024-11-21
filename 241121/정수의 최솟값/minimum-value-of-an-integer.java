import java.util.Scanner;

public class Main {
    public static int min(int[] a)
    {
        int min = 101;
        for(int i=0;i<3;i++)
        {
            if (a[i] < min)
            min = a[i];
        }
        return min;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i=0;i<3;i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.print(min(a));
    }
}