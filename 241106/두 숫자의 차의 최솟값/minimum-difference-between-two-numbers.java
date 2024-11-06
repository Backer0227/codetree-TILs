import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int minDiff = 101;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(minDiff > Math.abs(arr[i]-arr[j]))
                {
                    minDiff = Math.abs(arr[i]-arr[j]);
                }
            }
        }

        System.out.print(minDiff);
    }
}