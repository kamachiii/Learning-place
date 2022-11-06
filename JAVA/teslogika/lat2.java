import java.util.Scanner;

public class lat2 {
    public static void main(String[] args) {
        Scanner hasil = new Scanner(System.in);
        System.out.println("Masukkan nilai : ");
        int x = hasil.nextInt();
        for (int a = 1; a <= x + 2; a++){
            for (int b = 1; b <= x + 3; b++){
                if (a == b || a == b + 1){
                    System.out.print("*");
                }else {
                    System.out.print(b);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}