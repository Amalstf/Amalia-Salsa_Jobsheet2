package barangMain;

/**
 *
 * @author Hp
 */
public class BarangMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Barang b1 = new Barang();
        b1.namaBarang = "Corsair 2 GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok = 0;
        //b1.tambahStok(1);
        b1.kurangiStok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = "+hargaTotal);

        Barang b2 = new Barang("Logitech", "Wireless Mouse", 25, 150000);
                b2.tampilBarang();
    }
    
}
