import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        int button = 0;
        int num = 1;
        for(int i=n-1;i>=0;i--)
        {
            if(button %2 == 0)
            {
                for(int j=n-1;j>=0;j--)
                {
                    arr[j][i] = num;
                    num++;
                }
            }
            else
            {
                for(int j=0;j<n;j++)
                {
                    arr[j][i] = num;
                    num++;
                }
            }
            button++;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}