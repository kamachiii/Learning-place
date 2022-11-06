import java.util.Scanner;

public class lat9 {
    public static void main(String[] args) {
        Scanner hasil = new Scanner(System.in);
        int[] x = {1, 3, 5, 7, 9, 10};
        boolean amal = false;
        int j;
        System.out.println("Pilih mode :");
        System.out.format("1. Mencari bil. genap\n2.Mencari bil. ganjil\n");
        int i = hasil.nextInt();
        if (i == 1){
            for (j = 0; j < x.length; j++){
                if (x[j] % 2 == 0 && x[j] != 1 ){
                    amal = true;
                    break;
                }
            }
                if (amal == true){
                    System.out.print("Bilangan genap : ");
                    for (j = 0; j < x.length; j++){
                        if (x[j] % 2 == 0){
                            System.out.print(x[j] + " ");
                        }
                    }
                }else {
                    System.out.println("Angka tidak ada yang genap!");
                }
        }else if (i == 2){
            for (j = 0; j < x.length; j++){
                if (x[j] % 2 != 0){
                    amal = true;
                    break;
                }
            }
                if (amal == true){
                    System.out.print("Bilangan ganjil : ");
                    for (j = 0; j < x.length; j++){
                        if (x[j] % 2 != 0){
                            System.out.print(x[j] + " ");
                        }
                    }
                }else {
                    System.out.println("Angka tidak ada yang ganjil!");
                }
        }else {
            System.out.println("Kata kunci yang dimasukkan tidak ada!");
        }
    }
}
