/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package portofoliokamil;


import java.util.Scanner;//Agar bisa menginput
public class PortofolioKamil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        System.out.println("Form Login");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String userName = myObj.nextLine();  // Read user input
    if( !"admin".equals(userName))
    {
        System.out.format("Username is %s %n", userName);
        System.out.println("Terdaftar sebagai User");
    } else 
    {
        System.out.println("Enter Password");
        String password = myObj.nextLine();
        if (!"admin".equals(password)){
            System.out.println("Password yang anda masukkan salah!");
        } else {
            System.out.format("Username is: %s %n Password is: %s \n", userName, password);//user input
            System.out.println("Terdaftar sebagai: Admin");
        }
            // menggunakan format untuk mengisi agar memperkecil sintaks
            //format %s -> String
            /*
            format %d -> int
            format %f -> float
            format %n -> new line
            format %tB -> date & time
            format %td, %te -> date & time digit
            format
             */
        }
//        System.out.println("====================");
//        System.out.println("Masukkan Nilai :");
//    int x = myObj.nextInt();
//    if (x > 75){
//        System.out.println("Nilai mu Kompeten");
//    }else {
//        System.out.println("Nilaimu Tidak Kompeten");
//    }
    
        System.out.println("========================");
    System.out.println("About Creator :");
        System.out.println("Yoo Im Tamuramaro Kamachi, you can call me Kamachi.");
        System.out.println("I created this java sintax because i gabut");
        System.out.format("hmm...my dream want to be Web Developer %n but i learning java because lang java using OOP");
    
    }
    
}
