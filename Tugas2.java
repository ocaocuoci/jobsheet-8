import java.util.Scanner;
public class Tugas2{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String namaAtlet, cabor;
        int i;
        System.out.println("INFORMASI NAMA ATLET");

        System.out.print("Cabor: ");
        cabor = input.nextLine();
        int c = 1;
        while (c <= 4){
            System.out.print("Cabang olahraga " + c + " adalah" + cabor);
            for (i = 1; i <= 5; i++){
            System.out.print("Masukkan nama atlet ke-" + i);
            }
            c++;
        }



        
        
    }
}