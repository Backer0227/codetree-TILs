import java.util.Scanner;

public class Main {
    public static int min(int a, int b)
    {
        if(b == 0)
        {
            return a;
        }
        
        return min(b,a%b);
    }
    public static int recursion(int[] arr, int n)
    {
        if(n == 0)
        {
            return arr[0];
        }
        int A = recursion(arr,n-1);
        int minA = min(A,arr[n]);
        return (A*arr[n])/minA;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print(recursion(arr,n-1));
    }
}