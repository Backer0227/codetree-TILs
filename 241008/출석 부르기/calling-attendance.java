import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int attendanceNumber = sc.nextInt();

        if(attendanceNumber == 1)
        {
            System.out.print("John");
        }
        else if(attendanceNumber == 2)
        {
            System.out.print("Tom");
        }
        else if(attendanceNumber == 3)
        {
            System.out.print("Paul");
        }
        else
        {
            System.out.print("Vacancy");
        }
    }
}