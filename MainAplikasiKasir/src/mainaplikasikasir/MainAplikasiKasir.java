/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainaplikasikasir;
import classes.DaftarMenu;
import classes.Kuah;
import classes.Minuman;
import classes.Ramen;
import classes.Topping;
import java.util.Scanner;

/**
 *
 * @author zavia
 */
public class MainAplikasiKasir {


    
public DaftarMenu daftarMenu;
//Tambahan
public static double PAJAK_PPN = 0.10;
public static double BIAYA_SERVICE = 0.05;
//End of Tambahan
    
public static void main(String[] args) {
 //init
 Scanner input = new Scanner(System.in);
 //Tambahkan
 String no_transaksi, nama_pemesan, tanggal, no_meja = "";
 String transaksi_lagi = "", pesen_lagi = "", keterangan = "", makan_ditempat;
 int jumlah_pesanan, no_menu;
 //End of Tambahan
}
    private Object input;
    private Object makan_ditempat;

//mulai transaksi 
System.out.println("========== TRANSAKSI ==========");

//ambil data transaksi
System.out.print("No Transaksi : ");
no_transaksi = input.next();
System.out.print("Pemesan : ");
nama_pemesan = input.next();
System.out.print("Tanggal : [dd-mm-yyyy] ");
tanggal = input.next();
System.out.print("Makan ditempat? [Y/N] ");
makan_ditempat = input.next();

if (makan_ditempat.equalsIgnoreCase("Y")){
    System.out.print("Nomor Meja : ");
    no_meja = input.next();

//buat transaksi baru
    Transaksi trans = new Transaksi (no_transaksi, nama_pemesan, tanggal, no_meja);
    System.out.println("======== PESANAN ========");
    int no_kuah;
    do {
        //ambil menu berdasarkan nomor urut yang dipilih
        Menu menu_yang_dipilih = app.daftarMenu.pilihMenu();
        
        jumlah_pesanan = (int) app.cekInputNumber("Jumlah : ");
        
        //buat pesanan
        Pesanan pesanan = new Pesanan(menu_yang_dipilih, jumlah_pesanan);
        trans.tambahPesanan(pesanan);
        
        //khusus untuk menu ramen, pesanan kuahnya langsung diinput juga
        if (menu_yang_dipilih.getKategori().equals("Ramen")){
            //looping sesuai jumlah pesanan ramen
            int jumlah_ramen = jumlah pesanan ramen
            do{
                //ambil objek menu berdasarkan nomor yang dipilih
                Menu kuah_yang_dipilih = app.daftarMenu.pilihKuah();
                
                System.out.print("Level : [0-5 : ]");
                String level = input.next();
                
                //validasi jumlah kuah tidak boleh lebih besar dari jumlah_ramen
                int jumlah_kuah = 0;
                do{
                    jumlah_kuah = (int) app.cekInputNumber("Jumlah : ");
                    
                    if(jumlah_kuah > jumlah_ramen);
                    
                //set pesanan kuah
                Pesanan pesanan_kuah = (kuah_ yang_dipilih, jumlah_kuah);
                pesan_kuah.setKeterangan("Level " + level);
                
                //tambahkan pesanan kuah ke transaksi
                trans.tambahPesanan(pesan_kuah);
                
                
            //hitung jumlah ramen yang belum dipesan kuah nya
            jumlah_ramen == jumlah_kuah;
        } while (jumlah_pesanan > 0);
                
    } else{
        //jika keterangan tidak ditulis -
        System.out.print("Keterangan [- jika kosong]: ");
        keterangan = input.next();
    }
    
    //cek jika keterangan diisi selain "-" set ke pesanan
    if (!keterangan.equals("-")) {
        pesanan.setKeterangan(keterangan);
    }
            }
        
        //konfirmasi, mau tambah pesanan atau tidak
        System.out.print("Tambah Pesanan Lagi? [Y/N] : ");
        pesan_lagi = input.next();
    } while (pesan_lagi.equalsIgnoreCase("Y"));
   }

public void generateDaftarMenu() { 
    daftarMenu = new DaftarMenu();
    daftarMenu.tambahMenu(new Ramen("Ramen Seafood", 25000));
    daftarMenu.tambahMenu(new Ramen("Ramen Original", 18000));
    daftarMenu.tambahMenu(new Ramen("Ramen Vegetarian", 22000));
    daftarMenu.tambahMenu(new Ramen("Ramen Karnivor", 28000));
    daftarMenu.tambahMenu(new Kuah("Kuah Orisinil"));
    daftarMenu.tambahMenu(new Kuah("Kuah Internasional"));
    daftarMenu.tambahMenu(new Kuah("Kuah Spicy Lada"));
    daftarMenu.tambahMenu(new Kuah("Kuah Soto Padang"));
    daftarMenu.tambahMenu(new Topping("Crab Stick Bakar", 6000));
    daftarMenu.tambahMenu(new Topping("Chicken Katsu", 8000));
    daftarMenu.tambahMenu(new Topping("Gyoza Goreng", 4000));
    daftarMenu.tambahMenu(new Topping("Bakso Goreng", 7000));
    daftarMenu.tambahMenu(new Topping("Enoki Goreng", 5000));
    daftarMenu.tambahMenu(new Minuman("Jus Alpukat SPC", 10000));
    daftarMenu.tambahMenu(new Minuman("Jus Stroberi", 11000));
    daftarMenu.tambahMenu(new Minuman("Capucino Coffee", 15000));
    daftarMenu.tambahMenu(new Minuman("Vietnam Drip", 14000));
    
    daftarMenu.tampilDaftarMenu();
  }

    public double cekInputNumber(String label){
        try{
            Scanner get_input = new Scanner(System.in);
            System.out.println(label);
            double nilai = get_input.nextDouble();
            
            return nilai;
        }catch(InputMismatchExpection ex){
            System.out.print("[Err] Harap masukkan angka");
            return cekInputNumber(label);
        }
    }

    private static class app {

        public app() {
        }
    }

    private static class InputMismatchExpection {

        public InputMismatchExpection() {
        }
    }
    }

    private static class no_transaksi {

        public no_transaksi() {
        }
    }

    private static class nama_pemesan {

        public nama_pemesan() {
        }
    }

    private static class tanggal {

        public tanggal() {
        }
    }

    private static class makan_ditempat {

        public makan_ditempat() {
        }

        private static class equalsIgnoreCase {

            public equalsIgnoreCase() {
            }
        }
    }
}
