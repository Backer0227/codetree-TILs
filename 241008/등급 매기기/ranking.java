import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int Score = sc.nextInt();

        if(Score >= 90)
        {
            System.out.print("A");
        }
        else if(Score >= 80)
        {
            System.out.print("B");
        }
        else if(Score >= 70)
        {
            System.out.print("C");
        }
        else if(Score >= 60)
        {
            System.out.print("D");
        }
        else
        {
            System.out.print("F");
        }
    }
}