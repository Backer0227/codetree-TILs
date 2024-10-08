import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char Alphabet = sc.next().charAt(0);
        if (Alphabet == 'S')
        {
            System.out.print("Superior");
        }
        else if (Alphabet == 'A')
        {
            System.out.print("Excellent");
        }
        else if (Alphabet == 'B')
        {
            System.out.print("Good");
        }
        else if (Alphabet == 'C')
        {
            System.out.print("Usually");
        }
        else if (Alphabet == 'D')
        {
            System.out.print("Effort");
        }
        else
        {
            System.out.print("Failure");
        }
    }
}