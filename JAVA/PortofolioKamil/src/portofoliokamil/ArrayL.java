/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portofoliokamil;
import java.util.Scanner;
/**
 *
 * @author 7ono7u
 */
public class ArrayL {
    
    public static void main(String[] args){
//        String bio[] = {"Muhammad Kamil", "12108599", "Cibedug 2"};
//        for (int i = 0; i < bio.length; i++){
//            System.out.format("String ke [%d] : %s\n",i,bio[i]);
//        }
        
        Scanner x = new Scanner(System.in);
        System.out.println("Perbandingan bilangan");
        System.out.println("Berapa bilangan");
        System.out.println("2, 3, atau 4?");
        int a = x.nextInt();
        System.out.format("\n=========================\n");
        if (a == 2) {
            System.out.println("Masukkan bilangan Pertama :");
            int y = x.nextInt();
            System.out.println("Masukkan bilangan Kedua :");
            int z = x.nextInt();
            System.out.println("");
            if (y > z) {
                System.out.format("%d Lebih Besar daripada %d",y,z);
            } else if (y<z){
                System.out.format("%d Lebih Besar daripada %d",z,y);
            }else {
                System.out.format("%d Sama Besar dengan %d",y,z);
            }
            System.out.format("\n\n=========================\n");
        }else if (a == 3) {
            System.out.println("Masukkan bilangan Pertama :");
            int b = x.nextInt();
            System.out.println("Masukkan bilangan Kedua :");
            int c = x.nextInt();
            int d = x.nextInt();
            if (b > c && b > d) {
                System.out.format("%d Lebih Besar daripada %d dan %d",b,c,d);
            } else if (c > b && c > d){
                System.out.format("%d Lebih Besar daripada %d dan %d",c,d,b);
            }else if (d > b && d > c){
                System.out.format("%d Lebih Besar daripada %d dan %d",c,d,b);
            }else {
                System.out.format("%d Sama Besar dengan %d",b,c,d);
            }
            System.out.format("\n\n=========================\n");
        }
    }
    
}
