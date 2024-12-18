import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N*2];

        for(int i=0;i<N*2;i++)
        {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int[] newarr = new int[N];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<N;i++)
        {
            newarr[i] = arr[i]+arr[N*2-i-1];
            if (newarr[i] > max )
            {
                max = newarr[i];
            }
        }
        System.out.print(max);
    }
}