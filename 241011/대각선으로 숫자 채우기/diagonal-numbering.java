import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];
        int num=1;
        for(int i=0;i<m;i++)
        {
            int row = 0, column=i;
            for(int j=0;j<m;j++)
            {
                array[row][column] = num;
                num++;
                column--;
                row++;
                if(column <=-1 || row == n)
                {
                    break;
                }
            }
        }
        for(int i=1;i<n;i++)
        {
            int row = i, column = m-1;
            for(int j=i;j<n;j++)
            {
                array[row][column] = num;
                num++;
                column--;
                row++;
                if(row == n || column <=-1)
                {
                    break;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}