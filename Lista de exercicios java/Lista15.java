import java.util.Scanner;

public class Lista15 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int N;   
     int proximo, anterior = 0, atual = 1;

     System.out.println("digite um valor N: ");
     N = sc.nextInt();
     sc.close();
     
     for (int i = 1; i <= N; i++) {
         if (i == N) System.out.println(anterior);
         else System.out.print(anterior + " ");
         proximo = anterior + atual;
         anterior = atual;
         atual = proximo;
     }

    }
}
