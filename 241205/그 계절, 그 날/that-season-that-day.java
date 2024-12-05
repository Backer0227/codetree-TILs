import java.util.Scanner;

public class Main {
    public static boolean isTrue(int Y, int M, int D)
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
        if(Y % 4 == 0 && (Y % 100 != 0 && Y%4 == 0) || Y % 400 == 0)
        {
            if (D <= 29)
            {
                return true; 
            }
            else
            {
                return false;
            }
        }
        else
        {
            if (D <= 28)
            {
                return true; 
            }
            else
            {
                return false;
            }
        }
    }
    public static String semester(int M)
    {
        if(M>=3 && M <=5)
        {
            return "Spring";
        }
        else if(M >=6 && M<=8)
        {
            return "Summer";
        }
        else if(M >=9 && M <=11)
        {
            return "Fall";
        }
        else if(M == 12 || M <= 2)
        {
            return "Winter";
        }
        return "";
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();
        boolean A = isTrue(Y, M , D);
        if(A)
        {
            System.out.print(semester(M));
        }
        else
        {
            System.out.print(-1);
        }
    }
}