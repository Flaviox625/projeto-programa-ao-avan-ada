import java.util.Scanner;

public class Lista43 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe 0 nos dois valores para finalizar");
        
        while (true) {
            System.out.println("Informe o Valor da Compra");
        	int N = sc.nextInt();
            System.out.println("Informe o Valor pago");
        	int M = sc.nextInt();
            
        	int troco = M - N;
        	int[] notas = {2, 5, 10, 20, 50, 100};
        	boolean possivel = false;
        	
        	if (N == 0 && M == 0) break;
        	
    		for (int i = 0; i < 6; i++) {
    			for (int j = 0; j < 6; j++) {
    				if (troco - notas[j] == notas[i]) possivel = true;
    			}
    		}
    		
    		if (possivel) System.out.println("Possível");
    		else System.out.println("Impossível");
    	}   
        sc.close();    
    }
}