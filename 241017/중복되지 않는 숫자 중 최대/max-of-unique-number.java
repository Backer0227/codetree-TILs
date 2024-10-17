import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min= 1001;
        int count=0;
        int[] arr = new int[1000];
        for(int i = 0; i < n;i++)
        {
            int A = sc.nextInt();
            arr[A]++;
        }
        boolean notele = false;
        int idx = -1;
        for(int i = 1;i<1000;i++)
        {
            if(arr[i]==1)
            {
                notele = true;
                idx = i;
            }
        }
        if(notele)
        {
            System.out.print(idx);
        }
        else
        {
            System.out.print(-1);
        }
    }
}