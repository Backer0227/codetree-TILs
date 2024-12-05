import java.util.Scanner;

class IntWrapper{
    int value;
    public IntWrapper(int value)
    {
        this.value = value;
    }
}
public class Main {
    public static void func(IntWrapper n1, IntWrapper n2)
    {
        if(n1.value > n2.value)
        {
            n1.value *=2;
            n2.value +=10;
        }
        else
        {
            n2.value *=2;
            n1.value +=10;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        IntWrapper n1 = new IntWrapper(a);
        IntWrapper n2 = new IntWrapper(b);
        func(n1,n2);
        System.out.print(n1.value + " " + n2.value);
    }
}