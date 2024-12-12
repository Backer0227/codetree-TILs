import java.util.*;
class Secret
{
    String code;
    String place;
    int time;
    public Secret(String code, String place, int time)
    {
        this.code = code;
        this.place = place;
        this.time = time;
        System.out.printf("secret code : %s\n",code);
        System.out.printf("meeting point : %s\n",place);
        System.out.printf("time : %d\n",time);
    }

}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int c = sc.nextInt();

        Secret secret = new Secret(a,b,c);
    }
}