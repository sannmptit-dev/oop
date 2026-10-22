import java.util.Scanner;
public class bai01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age = sc.nextInt();
        System.out.println(name + " có điểm ="+age);
        sc.close();
    }

}
