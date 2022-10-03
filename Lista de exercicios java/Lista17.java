import java.util.Scanner;

public class Lista17 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int Numero,X,cont;

     System.out.println("Informe Quantos valores quer testar :");
     Numero = sc.nextInt();

     System.out.println("");

        for (int i = 0; i < Numero; i++) {
        	cont = 0;
            System.out.println("Informe um numero:");
        	X = sc.nextInt();
        	for (int j = 2; j < X; j++) {
        		if (X % j == 0) cont++;
        	}
        	if (cont == 0) System.out.println(X + " É Primo");
        	else System.out.println(X + " Não É Primo");
        }
        sc.close();
    }
	
}