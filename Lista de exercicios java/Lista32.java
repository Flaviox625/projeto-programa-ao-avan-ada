import java.util.Scanner;

public class Lista32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tipo = 0;
		float quantidadeA = 0, quantidadeG = 0, quantidadeD = 0;
		int alcool = 0, gasolina = 0, diesel = 0;
		int alc, gaso, dise;

		System.out.println("Informe o tipo de combustivel e a quantidade: ");

		for (int i = 0; i <= 4; i++) {
			tipo = sc.nextInt();

			switch (tipo) {
			case 1:
				
				alc = sc.nextInt();
				quantidadeA += alc;
				alcool+=1;
				break;
			case 2:
				
				gaso = sc.nextInt();
				quantidadeG +=gaso;
				gasolina+=1;
				break;
			case 3:
				
				dise = sc.nextInt();
				quantidadeD += dise;
				diesel+=1;
				break;
			}
		}
                sc.close();
                
		System.out.println("1.Alcool: " + alcool + " - Qtd Litros: " + quantidadeA);
		System.out.println("2.Gasolina: " + gasolina + " - Qtd Litros: " + quantidadeG);
		System.out.println("3.Diesel: " + diesel + " - Qtd Litros: " + quantidadeD);
	}
}
          