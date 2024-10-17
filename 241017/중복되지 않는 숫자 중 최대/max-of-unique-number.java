import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min= 1001;
        int count=0;
        int[] arr = new int[10];
        for(int i = 0; i < n;i++)
        {
            int A = sc.nextInt();
            arr[A]++;
        }
        for(int i=1;i<n;i++)
        {
            if(arr[i]<min && arr[i] != 0)
            {
                min = arr[i];
            }
        }
        boolean Ok = true;
        int idx=-1;
        for(int i=1;i<n;i++)
        {
            if(arr[i] == min)
            {
                idx = i;
                count++;
                if(count >= 2)
                {
                    Ok = false;
                    break;
                }
            }
        }
        if(Ok)
        {
            System.out.print(idx);
        }
        else
        {
            System.out.print(-1);
        }
    }
}