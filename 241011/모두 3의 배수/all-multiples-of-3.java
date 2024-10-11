import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        boolean Ok = true;
        for(int i=0;i<5;i++)
        {
            array[i] = sc.nextInt();
            if(array[i]%3 != 0)
            {
                Ok = false;
            }
        }

        if(Ok)
        {
            System.out.print(1);
        }
        else
        {
            System.out.print(0);
        }
    }
}