import java.util.Scanner;

public class DeretDescendingRekursif {
    static void deretRekursif(int n) {
        if (n < 0) { 
            return;
        }
        System.out.print(n + " "); 
        deretRekursif(n - 1);
    }

    static void deretIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan n: ");
        int n = sc.nextInt();

        System.out.println("Deret menggunakan rekursif:");
        deretRekursif(n); 
        System.out.println("\nDeret menggunakan iteratif:");
        deretIteratif(n); 
    }
}
