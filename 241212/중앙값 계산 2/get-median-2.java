import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            count++;
            if(i%2 == 0)
            {
                int[] newarr = new int[count];
                for(int j=0;j<count;j++)
                {
                    newarr[j] = arr[j];
                }
                Arrays.sort(newarr);
                System.out.print(newarr[i/2]+" ");
            }
        }
    }
}