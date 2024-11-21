import java.util.Scanner;

public class Main {
    public static boolean threes(int n)
    {
        String nString = Integer.toString(n);
        int[] arr = new int[nString.length()];
        for(int i=0;i<nString.length();i++)
        {
            arr[i] = nString.charAt(i)-'0';
            if((arr[i]%3 == 0 && arr[i] != 0) || n%3 == 0 )
            {
                return true;
            }
        }
        return false;

    }
    public static int sum(int a, int b)
    {
        int count = 0;
        for(int i=a;i<=b;i++)
        {
            if(threes(i))
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(sum(a,b));

    }
}