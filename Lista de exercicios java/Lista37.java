import java.util.Scanner;

public class Lista37 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N_Jogadas,Numero1,Numero2;
        String Jogador1,Jogador2,Par,Impar;

        System.out.println("Quantas jogadas vão ter: ");
        N_Jogadas = sc.nextInt();

        System.out.println("Informe respectivamente NOME,IMPAR ou PAR e NUMERO");
        System.out.println("");
        
        for (int i = 0; i < N_Jogadas; i++) {
           System.out.println("Nome do Primeiro jogador");
           Jogador1 = sc.next();
           Par = sc.next();
           Numero1 = sc.nextInt();

           System.out.println("Nome do Segundo jogador");
           Jogador2 = sc.next();
           Impar = sc.next();        
           Numero2 = sc.nextInt();        

            if((Numero1 + Numero2) % 2 == 0) {
                if(Par.equalsIgnoreCase("PAR")) System.out.println(Jogador1);
                else System.out.println(Jogador2);
            }else {
                if(Impar.equalsIgnoreCase("PAR")) System.out.println(Jogador2);
                else System.out.println(Jogador1);
            }
        } 
            sc.close();
    }
}
