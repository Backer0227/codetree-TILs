public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        int count = 0;

        for(int i=1;i<=10;i++)
        {
            if(!(i%2 == 0 || i%3 == 0 || i%5 == 0))
            {
                count++;
            }
        }
        System.out.print(count);
    }
}