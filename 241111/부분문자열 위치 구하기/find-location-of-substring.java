import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        String M = sc.next();

        int i = N.indexOf(M);

        System.out.print(i);
    }
}