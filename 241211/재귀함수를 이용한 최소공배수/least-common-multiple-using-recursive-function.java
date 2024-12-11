import java.util.Scanner;

public class Main {
    public static int min(int a, int b)
    {
        if(a<b)
        {   
            int temp = a;
            a = b;
            b = temp;
        }
        int r = a%b;
        if(r == 0)
        {
            return b;
        }
        else
        {
            return min(a,r);
        }
    }
    public static int recursion(int[] arr, int n)
    {
        if(n == 0)
        {
            return arr[0];
        }
        int A = recursion(arr,n-1);
        if(A%arr[n] == 0)
        {
            return A;
        }
        else
        {
            int minA = min(A,arr[n]);
            return (A*arr[n])/minA;
        }

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