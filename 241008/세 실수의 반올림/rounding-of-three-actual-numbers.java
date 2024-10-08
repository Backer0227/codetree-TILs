import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        double[] array = new double[3];
        for(int i=0;i<3;i++)
        {
            array[i] = sc.nextDouble();
        }
        for(int i=0;i<3;i++)
        {
            System.out.printf("%.3f\n",array[i]);
        }
    }
}