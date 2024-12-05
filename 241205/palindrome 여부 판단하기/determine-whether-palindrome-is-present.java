import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String s)
    {
        String y = s;
        for(int i=0;i<s.length()/2+1;i++)
        {
            if(y.charAt(i) != s.charAt(s.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        if(isPalindrome(s))
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}