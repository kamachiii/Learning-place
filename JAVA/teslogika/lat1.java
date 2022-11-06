import java.util.Scanner;

public class lat1{
    public static void main(String[] args){
        Scanner tampil = new Scanner(System.in);
        System.out.println("Masukkan tingkatan :");
        int x = tampil.nextInt();
        System.out.println("=================");
        for (int i = x; i > 0; i--){
            for (int j = x; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}