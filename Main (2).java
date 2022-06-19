package pemlantugas4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        // input data merchant
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 8000));

        System.out.println("Nama    :Muhammad Fathi Rizqi");
        System.out.println("Nim     :215150707111016");
        DataMerchant.tampilData();
        System.out.println();

       //tambah data merchant dengan inputan
        System.out.println("===Memasukkan Data Merchant Melalui Input===");
        System.out.print("Input Nama Merchant : ");
        String nm = input.nextLine();
        System.out.print("Input Nama Produk : ");
        String np = input.nextLine();
        System.out.print("Input Harga Produk : ");
        double h = input.nextDouble();
        input.nextLine();

        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant(nm, np, h));
        System.out.println();

        //menampilkan data merchant
        System.out.println("===Menampilkan Data Merchant===");
        DataMerchant.tampilData();
        System.out.println();

        //mengubah data merchant
        DataMerchant.updateMerchant(DataMerchant.cariMerchant("Bakso Pak Sahid"), "Bakso Pak Sahid", "Bakso Mercon", 15000);

        //menampilkan data merchant yang diupdate
        System.out.println("===Menampilkan Data Merchant yang nilainya sudah di update===");
        DataMerchant.tampilMerchant(DataMerchant.cariMerchant("Bakso Pak Sahid"));

        System.out.println();
        System.out.println("Nama    :Muhammad Fathi Rizqi");
        System.out.println("Nim     :215150707111016");



    }
}
