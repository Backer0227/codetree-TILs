import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        int B = sc.nextInt();
        int count = 0;
        for(int i=A.length()-1;i>=0;i--)
            {
                System.out.print(A.charAt(i));
                count++;
                if(count == B)
                {
                    break;
                }
            }
    }
}