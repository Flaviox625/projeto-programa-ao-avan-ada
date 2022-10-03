import java.util.Scanner;

public class Lista18 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int numero,comparador,inverte;
		
		comparador = 0;
		inverte = 0;
		
		while(comparador != 1)
		{					
			System.out.print("Digite um numero que no máximo contenha 4 digitos: ");
			numero = sc.nextInt();
            sc.close();

			if(numero > 9999)
			{
				System.out.print(numero + " ultrapassou os 4 digitos\n");
			}
			else
			{
				while(numero > 0)
				{
					inverte *= 10;
					inverte += (numero % 10);
					numero /= 10;
				}
				System.out.print("O numero invertido e = " + inverte + "\n");
				comparador = 1;
			}
		}
	}

}