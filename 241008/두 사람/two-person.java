import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int AAge = sc.nextInt();
        char AGender = sc.next().charAt(0);
        int BAge = sc.nextInt();
        char BGender = sc.next().charAt(0);

        if((AAge >= 19 && AGender == 'M') || (BAge >= 19 && BGender == 'M'))
        {
            System.out.print(1);
        }
        else
        {
            System.out.print(0);
        }
    }
}