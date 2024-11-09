import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] arr = new String[N];
        int count = 0, acount = 0;
        for(int i=0;i<N;i++)
        {
            arr[i] = sc.next();
            count += arr[i].length();
            if(arr[i].charAt(0) == 'a')
            {
                acount++;
            }
        }
        System.out.print(count +" "+acount);
    }
}