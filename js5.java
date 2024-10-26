import java.util.Scanner;

public class js5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jumlahPoliteknik = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline

        // Nama-nama cabang olahragar
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        
        for (int i = 1; i <= jumlahPoliteknik; i++) {
            System.out.print("Masukkan nama politeknik ke-" + i + ": ");
            String namaPoliteknik = scanner.nextLine();
            System.out.println("Politeknik: " + namaPoliteknik);

            // Loop melalui setiap cabang olahraga
            for (String cabor : cabangOlahraga) {
                System.out.println("Masukkan 5 atlet terbaik untuk cabang " + cabor + ":");
                
                // Input 5 nama atlet untuk cabang olahraga saat ini
                String atlet1 = scanner.nextLine();
                String atlet2 = scanner.nextLine();
                String atlet3 = scanner.nextLine();
                String atlet4 = scanner.nextLine();
                String atlet5 = scanner.nextLine();

                // Menampilkan nama-nama atlet
                System.out.println("Cabang Olahraga: " + cabor);
                System.out.println("  Atlet 1: " + atlet1);
                System.out.println("  Atlet 2: " + atlet2);
                System.out.println("  Atlet 3: " + atlet3);
                System.out.println("  Atlet 4: " + atlet4);
                System.out.println("  Atlet 5: " + atlet5);
                System.out.println();
            }
        }

        scanner.close();
    }
}
