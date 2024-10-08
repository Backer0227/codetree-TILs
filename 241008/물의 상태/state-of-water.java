import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();

        if(temperature<0)
        {
            System.out.print("ice");
        }
        else if(temperature>=0 && temperature<100)
        {
            System.out.print("water");
        }
        else
        {
            System.out.print("vapor");
        }
    }
}