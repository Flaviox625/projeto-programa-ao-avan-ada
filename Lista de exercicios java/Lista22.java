import java.util.Scanner;

public class Lista22 {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int Numero,Conta;

     System.out.println("Digite um Numero");
     Numero = sc.nextInt();
     sc.close();

     if(Numero <= 10) {
		Conta = 7;
	} else if (Numero>=11 && Numero<=30) {
		Conta = (Numero-10) * 1 + 7;
	} else if (Numero>=31 && Numero<=100) {
		Conta = (Numero-30) * 2 + 27;
	} else {
		Conta = (Numero-100) * 5 + 167;
	}
    System.out.println("O Valor em Reais é : "+Conta);

    }
}    