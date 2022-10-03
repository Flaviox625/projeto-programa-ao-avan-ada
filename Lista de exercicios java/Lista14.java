import java.util.Scanner;

public class Lista14 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int x;
        int cont = 0;

        System.out.println("Digite um valor inteiro:  ");
        x = sc.nextInt();
        sc.close();

            System.out.println("");

        while (cont < 6) {
            if (x % 2 ==1) {
                System.out.println(x);
                cont++;
                
            }          
              x++;
        }

    }       
}
