import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String first = sc.next();
        String second = sc.next();

        if(first.length() > second.length())
        {
            System.out.print(first +" " + first.length());
        }
        else if(first.length() < second.length())
        {
            System.out.print(second +" " + second.length());
        }
        else
        {
            System.out.print("same");
        }
    }
}