import java.util.Scanner;
public class Triangle12{
    public static void main(String[] args) {
        Scanner sc12 =new Scanner(System.in);

        int N;
        System.out.print("Masukkan nilai N = ");
        N = sc12.nextInt();
        int i = 0;
        
        while (i <= N){
            int j = 0;
            while(j < i){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        } 
    }
}