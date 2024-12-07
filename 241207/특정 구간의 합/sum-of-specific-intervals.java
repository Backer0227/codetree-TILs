import java.util.Scanner;

public class Main {
    public static int func(int[] arr, int[] a12)
    {
        int sum = 0;
        for(int j = a12[0]-1; j <= a12[1]-1;j++)
        {
            sum += arr[j];
        }
        return sum;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] A = new int[n];

        for(int i=0;i<n;i++)
        {
            A[i] = sc.nextInt();
        }

        for(int i=0;i<m;i++)
        {
            int[] a12 = new int[2];
            for(int k=0;k<2;k++)
            {
                a12[k] = sc.nextInt();
            }
            System.out.print(func(A,a12)+"\n");

        }
    }
}