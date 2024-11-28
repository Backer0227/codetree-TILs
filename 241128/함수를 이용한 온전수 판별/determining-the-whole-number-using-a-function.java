import java.util.Scanner;

public class Main {
    public static int countC(int a, int b)
    {
        int count = 0;
        for(int i=a;i<=b;i++)
        {
            String numb = Integer.toString(i);
            if(i%2 == 0)
            {
                continue;
            }
            if(numb.charAt(numb.length()-1) == '5')
            {
                continue;
            }
            if(i%3 == 0 && i%9 != 0)
            {
                continue;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(countC(a,b));

    }
}