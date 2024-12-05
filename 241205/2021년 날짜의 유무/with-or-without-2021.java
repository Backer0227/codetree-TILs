import java.util.Scanner;

public class Main {
    public static boolean isTrue(int M, int D)
    {
        int[] is31 = new int[]{1,3,5,7,8,10,12};
        int[] is30 = new int[]{4,6,9,11};
        
        for(int i=0;i<is31.length;i++)
        {
            if(M == is31[i])
            {
                if(D <= 31)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        for(int i=0;i<is30.length;i++)
        {
            if(M == is30[i])
            {
                if(D <= 30)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        if (D <= 28)
        {
            return true; 
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();

        boolean A = isTrue(M,D);
        if(A)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}