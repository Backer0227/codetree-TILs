import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        char alpha = A.charAt(0);
        int count = 0;
        String AEncode = "";
        for(int i=0;i<A.length();i++)
        {
            if(alpha != A.charAt(i))
            {
                AEncode = AEncode + alpha + count;
                alpha = A.charAt(i);
                count = 0;
            }
            count++;
            if(i == A.length()-1)
            {
                AEncode = AEncode + alpha + count;
                break;
            }
        }
        System.out.println(AEncode.length());
        System.out.print(AEncode);
    }
}