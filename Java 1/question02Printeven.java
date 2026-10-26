import java.util.Scanner;
public class question02Printeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i = i + 2) {
            System.out.println(i);
        }

        sc.close();
    }
}
