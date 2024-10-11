import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        for(int i=0;i<3;i++)
        {
            array[i] = sc.nextInt();
        }

        boolean Ok = false;
        for(int i = array[0];i<=array[1];i++)
        {
            if(i%array[2] == 0)
            {
                Ok = true;
            }
        }

        if(Ok)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }


    }
}