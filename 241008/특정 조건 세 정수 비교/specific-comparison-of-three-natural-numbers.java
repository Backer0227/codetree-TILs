import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        int minvalue=101;
        for(int i=0;i<3;i++)
        {
            array[i] = sc.nextInt();
        }
        
        for(int i=0;i<3;i++)
        {
            if(minvalue >= array[i])
            {
                minvalue = array[i];
            }
        }
        
        if(array[0] == minvalue)
        {
            System.out.print(1);
        }
        else
        {
            System.out.print(0);
        }

        if(array[0] == array[1] && array[1] == array[2])
        {
            System.out.print(" " + 1);
        }
        else
        {
            System.out.print(" "+ 0);
        }

    }
}