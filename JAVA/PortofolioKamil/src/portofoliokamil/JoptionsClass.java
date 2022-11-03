/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portofoliokamil;

import javax.swing.JOptionPane;

public class JoptionsClass {
    public static void main(String args[]){
        String name = JOptionPane.showInputDialog("Silahkan Masukkan Nama Anda");
        String nis = JOptionPane.showInputDialog("Silahkan Masukkan NIS Anda");
        JOptionPane.showMessageDialog(null, "Nama Anda : "+name);
        JOptionPane.showMessageDialog(null, "NIS Anda : "+nis);
    }
}
