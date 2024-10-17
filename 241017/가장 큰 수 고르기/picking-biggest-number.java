import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int maxVal = -1;

        for(int i = 0 ; i <10 ; i++)
        {
            int a = sc.nextInt();
            if(maxVal<a)
            {
                maxVal = a; 
            }
        }
        System.out.print(maxVal);

    }
}