public class Marmut {
    static int jumlahMarmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1; 
        }
        return jumlahMarmut(bulan - 1) + jumlahMarmut(bulan - 2); 
    }

    public static void main(String[] args) {
        int bulan = 12; 
        int hasil = jumlahMarmut(bulan); 
        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah: " + hasil);
    }
}
