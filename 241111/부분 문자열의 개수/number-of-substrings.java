import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        int index = 0;
        int count = 0;
        while((index = A.indexOf(B,index)) != -1)
        {
            count++;
            index+= 1;
        }
        System.out.print(count);
    }
}