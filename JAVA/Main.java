public class Main {
    public static void main(String[] args) {
      int x = 3;
      int z = 2;
      int y = 1;
      String Apa = " Lebih Besar daripada ";
      if (x > y && x > z) {
        System.out.println(x + Apa + y + " dan " + z);
        System.out.println("Variabel x lebih besar daripada variabel y dan z");
       }
      else if (y > x && y > z) {
        System.out.println(y + Apa + x + " dan " + z);
        System.out.println("Variabel y lebih besar daripada variabel x dan z");
       }
      else {
        System.out.println(z + Apa + x + " dan " + y);
        System.out.println("Variabel z lebih besar daripada variabel x dan y");
       }
    }
  }