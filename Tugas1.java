import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int N, i;
        System.out.print("Masukkan nilai N: ");
        N = input.nextInt();


        for (i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if (i == 0 || i == (N - 1) || j == 0 || j == (N - 1)){
                  System.out.print( N + " ");
                }
                else {
                     System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}