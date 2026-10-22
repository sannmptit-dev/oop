import java.util.Scanner;
public class baith02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] a =new int[n];
        for (int i=0;i<n;i++) a[i] = sc.nextInt();
        for (int i=0;i<n-1;i++) {
            boolean ok =true;
            for (int j=0;j<n-i-1;j++) {
                if(a[j]>a[j+1]){
                    int t = a[j];a[j] =  a[j+1];a[j+1] = t;
                    ok = false;
                }
            }
            if (ok) break;
            System.out.print("Buoc "+ (i+1)+ ":");
            for (int x:a)System.out.print(" "+ x);
            System.out.println();
        }
    }
}
