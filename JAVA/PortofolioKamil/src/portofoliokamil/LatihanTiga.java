/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portofoliokamil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LatihanTiga {
    public static void main (String args[]){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String nis;
    String nama;

            try{
                System.out.println("Masukkan NIS: ");
                nis = br.readLine();
                System.out.println("Masukkan Nama: ");
                nama = br.readLine();
                System.out.println("==============================");
                System.out.format("NIS : %s%n", nis);
                System.out.format("Nama : %s%n", nama);
            }catch(IOException eox) {
                System.out.println(eox);
            }
    }
    
}