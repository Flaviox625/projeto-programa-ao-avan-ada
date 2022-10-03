import java.util.Scanner;

public class Lista45 {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i,n=5;
            float[] idade = new float[n];
            String[] nome = new String[n];
            
            
            for (i = 0; i < n; i++) {
            	System.out.println("Informe Nome e idade ");                       
            	nome[i] = sc.nextLine();
                idade[i] = Float.parseFloat(sc.nextLine());            

            }
            
            double idadeMaisNova = 0;
            double idadeMaisVelha = 0;
            double media=0,soma = 0;
            String nomeDaPessoaMaisNova = "    ";
            for ( i = 0; i < n; i++) {
                if (i == 0) {
                    idadeMaisNova = idade[i];
                    nomeDaPessoaMaisNova = nome[i];

                }
                if (idadeMaisNova > idade[i]) {

                    idadeMaisNova = idade[i];

                    nomeDaPessoaMaisNova = nome[i];
                }

                if (idade[i] > idadeMaisVelha) {
                    idadeMaisVelha = idade[i];

                   
                }
                soma += idade[i];
                media=soma/5;
            }
            
               
            
      System.out.println("Maior idade = "+idadeMaisVelha);
      System.out.println("Nome da pessoa mais nova = " + nomeDaPessoaMaisNova);
      System.out.println("Media das idades = "+media);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
    }
}
