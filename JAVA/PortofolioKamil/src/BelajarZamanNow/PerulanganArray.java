/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BelajarZamanNow;

/**
 *
 * @author 7ono7u
 */
public class PerulanganArray {
    static void ulang(){
        System.out.println("Memanggil di file yang beda");
    }
    public static void main(String[] args){
        String[] ArrayHari={
            "Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu",
        };
        for (String ArrayHari1 : ArrayHari) {
            System.out.println("Sekarang hari " + ArrayHari1);
        }
    }
}
