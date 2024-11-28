import java.util.Scanner;

public class Main {
    public static int countC(int a, int b)
    {
        int count = 0;

        for(int i=a;i<=b;i++)
        {
            int oCount = 1;
            for(int j=2;j<=i;j++)
            {
                if(i%j == 0)
                {
                    oCount++;
                }
                if(oCount >= 3)
                {
                    break;
                }
            }
            if(oCount >= 3)
            {
                continue;
            }
            String aString = Integer.toString(i);
            int sum = 0;
            for(int j=0;j<aString.length();j++)
            {
                int num = aString.charAt(j) - '0';
                sum += num;
            }
            if (sum % 2 == 0)
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

        System.out.print(countC(a,b));
    }
}