import java.util.Scanner;

public class chuvi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println(0);
        } else {
            int chuVi = (a + b) * 2;
            int dienTich = a * b;
            System.out.println(chuVi + " " + dienTich);
        }

        sc.close();
    }
}
