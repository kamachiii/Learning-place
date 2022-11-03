/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BelajarZamanNow;

//import untuk memperkecil sintaks

import portofoliokamil.Perulangan;

public class PemanggilanClass {

    private static void apa() {
        System.out.println("Hallo");
    }

    public static void main(String[] args) {
//        memanggil dari file sama
        System.out.println("Mencoba memanggil class dari tempat sama");
        PemanggilanClass.apa();
        System.out.println("=================");

//        memanggil dari package yang sama
        System.out.println("Memanggil dari PerulanganArray.java");
        PerulanganArray.ulang();

//        memanggil dari source package yang sama
        System.out.println("Memanggil dari SP yang sama");
        Perulangan.main(args);
    }
}
