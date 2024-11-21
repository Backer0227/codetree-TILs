import java.util.Scanner;

public class Main {
    public static void prints()
    {
        System.out.print("12345^&*()_");
        System.out.print("\n");
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0;i<N;i++)
        {
            prints();
        }
    }
}