import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] array = new int[3];

        for(int i=0;i<3;i++)
        {
            array[i] = sc.nextInt();
        }
        
        Arrays.sort(array);

        System.out.print(array[1]);
    }
}