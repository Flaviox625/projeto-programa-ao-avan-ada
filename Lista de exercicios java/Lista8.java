import java.util.Scanner;

public class Lista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double RC,IR,RH,RM,RL;
        int ALIO;
        

        System.out.println("Digite a renda do homem");
        RH = sc.nextDouble();
        System.out.println("Digite a renda da mulher");
        RM = sc.nextDouble();

        RC = RH + RM;
        
        sc.close();

        if (RC <= 900) {
            ALIO = 0;
            RL = RC;
            System.out.println("RENDA CONJUNTA: "+RC);
            System.out.println("ALIQUOTA UTILIZADA: INSENTO");
            System.out.println("IMPOSTO DE RENDA: "+ALIO);
            System.out.println("RENDA LIQUIDA: "+RL);
  
            
        } 
        if ((RC >= (900.01)) && (RC <= (1500.00))) {
            ALIO = 10;
            IR = (RC*ALIO) /100;
            RL = RC - IR;
            System.out.println("RENDA CONJUNTA: "+RC);
            System.out.println("ALIQUOTA UTILIZADA: "+ALIO+"%");
            System.out.println("IMPOSTO DE RENDA: "+IR);
            System.out.println("RENDA LIQUIDA: "+RL);

        }
        if ((RC >= (1500.01)) && (RC <= (2500.00))) {
            ALIO = 15;
            IR = (RC*ALIO) /100;
            RL = RC - IR;
            System.out.println("RENDA CONJUNTA: "+RC);
            System.out.println("ALIQUOTA UTILIZADA: "+ALIO+"%");
            System.out.println("IMPOSTO DE RENDA: "+IR);
            System.out.println("RENDA LIQUIDA: "+RL);

        }
        if (RC > 2500.01) {
            ALIO = 25;
            IR = (RC*ALIO) /100;
            RL = RC - IR;
            System.out.println("RENDA CONJUNTA: "+RC);
            System.out.println("ALIQUOTA UTILIZADA: "+ALIO+"%");
            System.out.println("IMPOSTO DE RENDA: "+IR);
            System.out.println("RENDA LIQUIDA: "+RL);
            
        }
           
        

}       
}