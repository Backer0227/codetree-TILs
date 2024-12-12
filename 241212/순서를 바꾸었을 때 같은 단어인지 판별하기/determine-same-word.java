import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        char[] Achar = A.toCharArray();
        char[] Bchar = B.toCharArray();
        Arrays.sort(Achar);
        Arrays.sort(Bchar);

        String AString = new String(Achar);
        String BString = new String(Bchar);
        
        if(AString.equals(BString))
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}