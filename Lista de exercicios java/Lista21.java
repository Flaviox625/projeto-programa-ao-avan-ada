import java.util.Scanner;

public class Lista21 {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int ano[]=new int[3];
        double velocidade[]=new double[3];
        double V_Maior = 0;
        int A_maior = 0;

        for (int i = 0;i < ano.length;i++){
            System.out.println("Digite o ano : ");                       
            ano[i] = sc.nextInt();
        }
         for (int j = 0;j < velocidade.length;j++){
            System.out.println("Digite a velocidade");
            velocidade[j] = sc.nextDouble();    
         }
        
         sc.close();
        
        for (int i = 0;i < ano.length;i++){
            if (ano[i] == 0) {
                A_maior = ano[i];
            }else if (A_maior < ano[i]) {
                A_maior = ano[i];
                
            }
        }
        for (int i = 0;i < velocidade.length;i++){
            if (velocidade[i] == 0) {
                V_Maior = velocidade[i];
            }else if (V_Maior < velocidade[i]) {
                V_Maior = velocidade[i];
                
            }
        }      

          System.out.println("Ano do carro mais novo : "+A_maior);
          System.out.println("Velocidade do carro mais rapido : "+V_Maior);
    }
}     