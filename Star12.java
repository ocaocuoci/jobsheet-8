import java.util.Scanner;
public class Star12{
    public static void main(String[] args) {
        Scanner sc12 =new Scanner(System.in);

        int N;
        System.out.print("Masukkan nilai N = ");
        N = sc12.nextInt();

        for (int i = 1; i <= N; i--){
            System.out.print("*");
        } 
        System.out.println();

        
    }
}