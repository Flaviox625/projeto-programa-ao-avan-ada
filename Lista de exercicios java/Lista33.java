import java.util.Scanner;

public class Lista33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

      System.out.println("informe o valor de N : ");
      N = sc.nextInt();

      sc.close();

      for (int i = 1; i <= N*4; i+=4){
            System.out.print(i + " ");
			System.out.print(i+1 + " ");
			System.out.print(i+2 + " ");
			System.out.println("PUM");
      }
        
    }
}
