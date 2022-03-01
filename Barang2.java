package barang2main;

/**
 *
 * @author Hp
 */
class Barang2 {
   String nama;
    int hargaSatuan, jumlah;

    void tampilBarang() {
        System.out.println("Nama : " + nama);
        System.out.println("Jumlah : "+jumlah);
        System.out.println("Harga Satuan : " + hargaSatuan);
    }

    int hitungHargaTotal(int i) {
        int totalHarga;
        totalHarga = hargaSatuan*jumlah;
        return totalHarga;
    }

    double hitungDiskon(double j) {
        double diskon = 0;
        if (j > 100000) {
            diskon = j*0.1;
        }else if(j >= 50000 && j <= 100000){
            diskon = j *0.05;
        }else{
            diskon = 0;
        }
        return diskon;
    }

    double hitungHargaBayar(double j, double i){
        double hargaBayar = 0;
        hargaBayar = i - j;
        return hargaBayar;
    }
    
}
