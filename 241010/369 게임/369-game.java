import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            String a = String.valueOf(i);
            int count=0;
            for(int j=0; j<a.length();j++)
            {
                if(i%3 == 0|| a.charAt(j) == '3'|| a.charAt(j) == '6'|| a.charAt(j) == '9')
                {
                    System.out.print(0+" ");
                    if(j == 0 || j == 1)
                    {
                        break;
                    }
                }
                count++;
                if(count == a.length())
                {
                	System.out.print(i+" ");
                	break;
                }
            }
            
        }
    }
}