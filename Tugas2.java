import java.util.Scanner;
public class Tugas2{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String namaAtlet, cabor, namaPoltek;
        int i, jmlAtlet, jumlahPoliteknik;
        
        System.out.println("------------------------------------------");
        System.out.println("---- PORSENI POLITEKNIK NEGERI MALANG ----");
        System.out.println("----   DAFTAR NAMA PESERTA PORSENI    ----");
        System.out.println("------------------------------------------");  
        System.out.println();

        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
         jumlahPoliteknik = input.nextInt();

        for (i = 1; i <= jumlahPoliteknik; i++){
            System.out.print("Inputkan Nama Politeknik yang mendaftar ke-" + i + ": ");
            namaPoltek = input.nextLine();
            input.nextLine();

            for (int k = 1; k <= 4; k++){
                System.out.print("Input Nama Cabang Olahraga ke-" + k + ": ");
                cabor = input.nextLine();
                System.out.println();

                System.out.println("iNFORMASI NAMA - NAMA ATLET");

                 for (int j = 1; j <= 5; j++){
                System.out.print("Atlet ke-" + j + ": ");
                namaAtlet = input.nextLine();
                 }
            }
        }

 
    }
}