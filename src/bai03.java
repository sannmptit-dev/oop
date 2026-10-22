import java.util.Scanner;
public class bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String maSV = "B20DCCN001";
        String hoTen = sc.nextLine();
        String lop = sc.nextLine();
        String ngaysinh = sc.nextLine();
        float gpa=Float.parseFloat(sc.nextLine().trim());
        String[] parts = ngaysinh.split("/");
        ngaysinh = String.format("%02d/%02d/%04d",
                Integer.parseInt(parts[0]),
                Integer.parseInt(parts[1]),
                Integer.parseInt(parts[2]));
        System.out.printf("%s %s %s %s %.2f\n",maSV,hoTen,lop,ngaysinh,gpa);

        sc.close();
    }
}
