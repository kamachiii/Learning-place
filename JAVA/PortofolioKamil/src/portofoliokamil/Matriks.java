/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portofoliokamil;

/**
 *
 * @author 7ono7u
 */
    import javax.swing.JOptionPane;

public class Matriks {

    public static void main(String[] args) {
        int matriks1[][] = new int[2][2];
        int matriks2[][] = new int[2][2];

        boolean benar = true;
        while (benar) {
            int pilih = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                     Kalkulator Matrik
                                                                     1. Input Matrik 1
                                                                     2. Input Matrik 2
                                                                     3. Jumlahkan
                                                                     4. Kurangkan
                                                                     5. Kalikan 
                                                                     6. Keluar"""));
         
            switch (pilih) {
                case 1:
                    for (int baris = 0; baris < matriks1.length; baris++) {
                        for (int kolom = 0; kolom < matriks1[0].length; kolom++) {
                            matriks1[baris][kolom] = Integer.parseInt(JOptionPane.showInputDialog("Input Matriks Baris ke " + baris
                                    + " Kolom ke " + kolom));
                        }
                    }   JOptionPane.showMessageDialog(null, matriks1[0][0] + " " + matriks1[0][1] + "\n"
                            + matriks1[1][0] + " " + matriks1[1][1]);
                    break;
                case 2:
                    for (int baris = 0; baris < matriks2.length; baris++) {
                        for (int kolom = 0; kolom < matriks2[0].length; kolom++) {
                            matriks2[baris][kolom] = Integer.parseInt(JOptionPane.showInputDialog("Input Matriks Baris ke " + baris
                                    + " Kolom ke " + kolom));
                        }
                    }   JOptionPane.showMessageDialog(null, matriks2[0][0] + " " + matriks2[0][1] + "\n"
                            + matriks2[1][0] + " " + matriks2[1][1]);
                    break;
                case 6:
                    benar = false;
                    break;
                default:
                    break;
            }
        }

    }

}

