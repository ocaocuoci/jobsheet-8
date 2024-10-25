import java.util.Scanner;
public class RataNilai12 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int i, j;
        float nilai, totalNilai, RataNilai;

        i = 1;
        while(i <= 5){ /* outer loop */
            System.out.print("Input nilai mahasiswa ke-" + i);
            totalNilai = 0;
            for (j =1; j <= 5; j++){ /* inner loop */
                System.out. print("Nilai ke-" +j + "= ");
                int nilaiMhs = input.nextInt(); /* input nilai */
                totalNilai += nilaiMhs; /*menghitung jumlah nilai */
            }
            RataNilai = totalNilai / 5; /*menghitung rata nilai yang diinput */
            i++;
            System.out.print("Nilai rata rata ke-" + i + "adalah " + RataNilai);

        } 
        
    }
}