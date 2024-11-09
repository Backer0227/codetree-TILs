import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] A = new String[2];

        for(int i=0;i<2;i++)
        {
            A[i] = sc.nextLine();
            for(int j=0;j<A[i].length();j++)
            {
                if(A[i].charAt(j) != ' ')
                {
                    System.out.print(A[i].charAt(j));
                }
            }
        }

        
    }
}