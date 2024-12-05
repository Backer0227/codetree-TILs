import java.util.Scanner;

class IntWrapper
{
    int value;
    public IntWrapper(int value)
    {
        this.value = value;
    }
    public int getter()
    {
        return value;
    }
}
public class Main {
    public static void swap(IntWrapper n1, IntWrapper n2)
    {
        int temp;
        temp = n1.value;
        n1.value = n2.value;
        n2.value = temp;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        IntWrapper n1 = new IntWrapper(n);
        IntWrapper n2 = new IntWrapper(m);
        swap(n1,n2);
        System.out.print(n1.getter()+" " + n2.getter());
    }
}