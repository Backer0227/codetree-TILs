import java.util.Scanner;

public class Main {
    public static int func(String A, String B)
    {
        for(int i=0;i<A.length()-B.length()+1;i++)
        {
            int count = 0;
            int now = i;
            for(int j=0;j<B.length();j++)
            {
                if(B.charAt(j) != A.charAt(now))
                 {
                    break;
                 }
                 count++;
                 now++;
                if(count == B.length())
                {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String M = sc.next();
        String N = sc.next();

        System.out.print(func(M,N));
    }
}