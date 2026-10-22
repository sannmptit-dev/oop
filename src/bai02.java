import java.util.Scanner;
public class bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int canhbehon= Math.min(a,b);
        int chuvi=(a+b)*2;
        int dientich=a*b;
        System.out.println(chuvi);
        System.out.println(dientich);
        System.out.println(canhbehon);
    }
}
