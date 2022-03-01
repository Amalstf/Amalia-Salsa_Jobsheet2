package barang2main;

/**
 *
 * @author Hp
 */
public class Barang2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Barang2 b2 = new Barang2();
        b2.nama = "Haikal";
        b2.jumlah = 6;
        b2.hargaSatuan = 20000;
        int total = b2.hitungHargaTotal(6);
      double diskon = b2.hitungDiskon(total);
       double bayar = b2.hitungHargaBayar(diskon, total);
        System.out.println("Total Harga : "+total);
        System.out.println("Diskon yang Didapat : "+diskon);
        System.out.println("Harga 6 Buah = " + bayar);
        b2.tampilBarang();
    }
    
}
