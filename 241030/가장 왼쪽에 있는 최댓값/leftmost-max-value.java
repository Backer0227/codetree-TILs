import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] array = new int[N];
        for(int i=0;i<N;i++)
        {
            array[i] = sc.nextInt();
        }
        for(int i=N-1;i>=0;i--)
        {
            int max=0;
            for(int j=i;j>=0;j--)
            {
                if(array[j] > max)
                max = array[j];
            }
            for(int j=0;j<=i;j++)
            {
                if (array[j] == max)
                {
                    System.out.print(j+1 + " ");
                    i = j;
                    break;
                }
            }
        }
    }
}