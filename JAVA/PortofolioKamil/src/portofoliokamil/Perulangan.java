/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portofoliokamil;

/**
 *
 * @author 7ono7u
 */
public class Perulangan {
    public static void ulang(){
        System.out.println("Mengulang");
}
    public static void main(String[] args){
        
        //perulangan for
        int a;
        for (a = 1;  a <= 10; a++){
            System.out.println("Perulangan ke- "+a);  
        }
        
        //perulangan while
        int i = 1;
        while (i<=7){
            System.out.format("Perulangan ke- %d ",i);
            i++;
        }
        
        //perulangan dengan continue dan break
        for(a=0; a<30; a++){ 
        System.out.format("-%d\n",a);
        }
    }
}
