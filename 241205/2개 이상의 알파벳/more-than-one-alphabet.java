import java.util.Scanner;

public class Main {
    public static boolean isDiff(String A)
    {
        int[] alphabet = new int[26];
        for(int i=0;i<A.length();i++)
        {
            int alpha = (int)A.charAt(i) - 97;
            alphabet[alpha]++;
        }
        int count = 0;
        for(int i=0;i<26;i++)
        {
            if(alphabet[i] > 0)
            {
                count++;
            }
        }
        if(count >=2)
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
        String A = sc.next();

        if(isDiff(A))
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }

    }
}