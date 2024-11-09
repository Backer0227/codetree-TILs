import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] A = new String[]{"apple","banana","grape","blueberry","orange"};

        char alpha = sc.next().charAt(0);
        int count = 0;
        for(int i=0;i<5;i++)
        {
            if(A[i].charAt(2) == alpha || A[i].charAt(3) == alpha)
            {
                System.out.println(A[i]);
                count++;
            }
        }
        System.out.print(count);
    }
}