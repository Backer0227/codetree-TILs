import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        int max=0,min=21;
        for(int i=0;i<3;i++)
        {
            arr[i] = sc.next();
            if(arr[i].length()>max)
            {
                max = arr[i].length();
            }
            if(arr[i].length()<min)
            {
                min = arr[i].length();
            }
        }
        System.out.print(max-min);
    }
}