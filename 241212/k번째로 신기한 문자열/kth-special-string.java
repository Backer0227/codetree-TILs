import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String T = sc.next();
        String[] arr = new String[n];
        int count = 0;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.next();
            if(arr[i].indexOf(T) == 0)
            {
                count++;
            }
        }
        String[] arrT = new String[count];
        int a = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i].indexOf(T) == 0)
            {
                arrT[a] = arr[i];
                a++;
            }
        }
        Arrays.sort(arrT);

        System.out.print(arrT[k-1]);

    }
}