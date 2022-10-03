import java.util.Scanner;

public class Lista44 {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int i, n = 5;
			double[] V = new double[n];

			for (i = 0; i < n; i++) {
				System.out.printf("Informe %2do valor de %d: ", (i + 1), n);
				V[i] = sc.nextInt();
			    

			}
			double total_impar = 0, qnt_impar = 0;		
			double media = total_impar / qnt_impar;
			double maiorP =0;
			double Diferenca = 0;
			double menor =0;
			double maior = 0 ;
			for (int k = 0; k < n; k++) {
			    if (V[k] % 2 != 0) {
					total_impar += V[k];
					qnt_impar++;
				}
				if (k == 0) {
					menor = V[k];
					maior = V[k];

				}else if(V[k]<menor){
					menor = V[k];
					
				}
				else if(V[k] > maior) {
					maior = V[k];

				}
				if (V[k] % 2 == 0) {
					if (maiorP < V[k] ) {
						
						maiorP = V[k];					
					}

				}
				
			}   Diferenca = maior - menor;
			    System.out.println("Media dos Impares = " + media);
			    System.out.println("Maior Numero PAR = " + maiorP);
			    System.out.println("Diferença = " + Diferenca);
		}
            
		
	}
}
