import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];

        for(int i=0;i<N;i++)
        {
            arr[i] = sc.next();
        }
        char A = sc.next().charAt(0);
        int count=0,length=0;
        for(int i=0;i<N;i++)
        {
            if(arr[i].charAt(0) == A)
            {
                length+= arr[i].length();
                count++;
            }
        }
        System.out.printf("%d %.2f",count,(double)length/count);
    }
}