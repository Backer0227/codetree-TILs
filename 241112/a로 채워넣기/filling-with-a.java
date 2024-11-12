import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String s2 = s.substring(0,1)+ 'a' + s.substring(2,s.length()-2)+'a'+s.charAt(s.length()-1);

        System.out.print(s2);
    }
}