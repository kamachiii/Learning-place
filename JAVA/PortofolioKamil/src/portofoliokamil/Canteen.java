/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portofoliokamil;
/**
 *
 * @author 7ono7u
 */
import java.util.Scanner;

public class Canteen {
    public static void main(String[] args){
        Scanner Food = new Scanner(System.in);
        System.out.println("Form Pembelian");
        System.out.format("Jenis Menu : %n - Ayam Bakar %n - Ikan Bakar %n");
        String x = Food.nextLine(); 
        String c = x.toLowerCase();
        if ("ayam bakar".equals(c)){
            System.out.println("Ingin Membeli berapa ?");
            int jml = Food.nextInt();
            System.out.println("Silahkan bayar " + (jml*50) + "k");
            System.out.println("Bayar :");
            int byr = Food.nextInt();
            System.out.println("");
            System.out.println("Transaksi");
            System.out.println("=======================");
            System.out.println("Makanan: " + c);
            System.out.format("Total: " + jml + " x 50k %n" + (jml*50) + "k %n");
            System.out.println("Pembayaran: " + byr + "k");
            System.out.println("Hasil: " + byr + " - " + (jml*50) + " = " + (byr-(jml*50) + "k"));
            if (byr > (jml*50)) {
                
                System.out.println("Kembalian " + (byr - (jml*50)) + "k");
                System.out.println("Makanan anda akan segera tiba!");
            }
            else if (byr == (jml*50)) {
                System.out.println("Makanan anda akan segera tiba!");
            }
            else {
                System.out.println("Maaf Uang anda tidak cukup!");
                System.out.println("Silahkan kembali lain waktu");
            }
            System.out.println("========================");
            
        } else if ("ikan bakar".equals(c)) {
            System.out.println("Ingin Membeli berapa ?");
            int jml = Food.nextInt();
            System.out.println("Silahkan bayar " + (jml*35) + "k");
            System.out.println("Bayar :");
            int byr = Food.nextInt();
            System.out.println("");
            System.out.println("Transaksi");
            System.out.println("=======================");
            System.out.println("Makanan: " + c);
            System.out.format("Total: " + jml + " x 35k %n" + (jml*35) + "k %n");
            System.out.println("Pembayaran: " + byr + "k");
            System.out.println("Hasil: " + byr + " - " + (jml*35) + " = " + (byr-(jml*35) + "k"));
            if (byr > (jml*35)) {
                
                System.out.println("Kembalian " + (byr - (jml*35)) + "k");
                System.out.println("Makanan anda akan segera tiba!");
            }
            else if (byr == (jml*35)) {
                System.out.println("Makanan anda akan segera tiba!");
            }
            else {
                System.out.println("Maaf Uang anda tidak cukup!");
                System.out.println("Silahkan kembali lain waktu");
            }
            System.out.println("========================");
        } else {
            System.out.println("Makanan Tidak ada di daftar menu...");
        }System.out.println("https://github.com/kamachiii");
    }
    
}
