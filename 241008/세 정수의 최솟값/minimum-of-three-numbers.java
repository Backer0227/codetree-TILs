import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int minValue= 101;
        int[] array = new int[3];
        for(int i=0;i<3;i++)
        {
            array[i] = sc.nextInt();
            if(minValue >= array[i])
            {
                minValue = array[i];
            }
        }

        System.out.print(minValue);
        
    }
}