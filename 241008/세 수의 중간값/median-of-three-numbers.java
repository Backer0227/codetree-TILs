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

        if((array[1]>array[0]) && (array[1]<array[2]))
        {
            System.out.print(1);
        }
        else
        {
            System.out.print(0);
        }
    }
}