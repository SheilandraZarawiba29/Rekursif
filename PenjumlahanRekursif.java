import java.util.Scanner;

public class PenjumlahanRekursif {
    static int hitungPenjumlahan(int n) {
        if (n == 1) {
            return 1; 
        }
        return n + hitungPenjumlahan(n - 1); 
    }

    static void cetakDeret(int n) {
        if (n == 1) {
            System.out.print("1"); 
            return;
        }
        cetakDeret(n - 1); 
        System.out.print("+" + n); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan f: ");
        int f = sc.nextInt();
        
        System.out.print("Deret penjumlahan: ");
        cetakDeret(f); 
        System.out.println(" = " + hitungPenjumlahan(f));
    }
}