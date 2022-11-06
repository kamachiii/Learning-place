import java.util.Scanner;

public class lat8 {
    public static void main(String[] args) {
        Scanner hasil = new Scanner(System.in);
        int[] x = {1, 2, 5, 12, 7, 3, 8};
        System.out.print("Data yang ada : ");
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
        System.out.println("Masukkan nilai yang akan dihapus : ");
        int jml = hasil.nextInt();
        for (int i = 0; i < x.length; i++){
            if(x[i] == jml){
                // shifting elements
                for(int j = i; j < x.length - 1; j++){
                    x[j] = x[j+1];
                }
                break;
            }
        }
        System.out.println("Sisa data Array : " );
        for(int i = 0; i < x.length - 1; i++){
            System.out.print(x[i]+ " ");
        }                
    }
} 