import java.util.Scanner;
public class baith04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double x1 = sc.nextDouble(), y1 = sc.nextDouble();
            double x2 = sc.nextDouble(), y2 = sc.nextDouble();
            double x3 = sc.nextDouble(), y3 = sc.nextDouble();

            double a = Math.sqrt((x1-x2)* (x1-x2)+(y1-y2)*(y1-y2));
            double b = Math.sqrt((x2-x3)* (x2-x3)+(y2-y3)*(y2-y3));
            double c = Math.sqrt((x3-x1)* (x3-x1)+(y3-y1)*(y3-y1));
            if (a+b>c&& a+c>b && b+c>a) {
                System.out.printf("%.3f\n",a + b + c );
            }else{
                System.out.println("INVALID");
            }
        }
        sc.close();
    }
}
