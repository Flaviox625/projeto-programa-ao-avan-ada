import java.util.Scanner;

public class Lista40 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B,C;

        System.out.println("Digite o lado 1");
        A = sc.nextInt();
		
        System.out.println("Digite o lado 2");
        B = sc.nextInt(); 
		
		System.out.println("Digite o lado 3");
        C = sc.nextInt(); 

        sc.close();

		if( A < B + C && B < A + C && C < A + B ){ 
			if(A==B && B==C){ 
				System.out.print("Eqüilátero");
			}else if(A==B || A==C || B==C){ 
				System.out.print("Isósceles");
			}else{
				System.out.print("Escaleno");
			}
		}else{
			System.out.print("Os lados fornecidos não caracterizam um triângulo");
		}

    }
    
}
