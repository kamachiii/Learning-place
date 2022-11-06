import java.util.Scanner;

public class lat7 {
    public static void main(String[] args) {
        Scanner hasil = new Scanner(System.in);
        String[] warna = {"merah", "biru", "kuning", "hijau", "ungu"};
        int x;
        String y, a;
        boolean z;
        System.out.println("Data yang ada : ");
        for (x = 0; x < 5; x++){
            System.out.print(warna[x] + " ");
        }
        System.out.println();
        System.out.println("Masukkan data yang ingin di cari :");
        y = hasil.nextLine();
        a = y.toLowerCase();
        z = false;
        for (x = 0; x < 5; x++){
            if (warna[x].equals(a)){
                z = true;
                break;
            }
        }
        if (z == true){
            System.out.format("Data berada di urutan ke %s didalam array",x);
        }else {
            System.out.println("Data tidak ditemukan!");
        }
    }
}