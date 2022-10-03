import java.util.Scanner;

public class Lista36 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.println("Digite um Numero : ");
        N = sc.nextInt();

        sc.close();

        if ((1 < N)&&(N <= 10)) {
            for (int i = 0; i < N-1; i++) {
                System.out.print("Ho ");
              }
              System.out.println("Ho!");
            
        }
    }
}