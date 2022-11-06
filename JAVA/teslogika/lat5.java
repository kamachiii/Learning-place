import java.util.Scanner;

public class lat5 {
    public static void main(String[] args) {
        Scanner hasil = new Scanner(System.in);
        System.out.println("Masukkan nilai :");
        int x = hasil.nextInt();
        System.out.println("=============");
        for (int i = 1; i <= x; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}