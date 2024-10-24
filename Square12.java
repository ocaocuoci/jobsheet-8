import java.util.Scanner;
public class Square12{
    public static void main(String[] args) {
        Scanner sc12 =new Scanner(System.in);

        int N, i;
        System.out.print("Masukkan nilai N = ");
        N = sc12.nextInt();

        for(int iOuter = 1; iOuter <= N; iOuter++){
            for (i = 1; i <= N; i++){
                System.out.print("*");
            }
            System.out.println();
        } 

    }
}