import java.util.Scanner;

public class Main {
    public static boolean AB(int[] A, int[] B)
    {
        for(int i=0;i<A.length-B.length;i++)
        {
            int count = 0;
            int inum = i;
            for(int j=0;j<B.length;j++)
            {
                if(A[inum] != B[j])
                {
                    break;
                }
                else
                {
                    inum++;
                    count++;
                    if(count == B.length)
                    {
                        return true;
                    }
                    continue;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] A = new int[n1];
        int[] B = new int[n2];

        for(int i=0;i<n1;i++)
        {
            A[i] = sc.nextInt();
        }
        for(int i=0;i<n2;i++)
        {
            B[i] = sc.nextInt();
        }

        if(AB(A,B))
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}