import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        char[] arr = A.toCharArray();
        Arrays.sort(arr);

        String newA = new String(arr);
        System.out.print(newA);
    }
}