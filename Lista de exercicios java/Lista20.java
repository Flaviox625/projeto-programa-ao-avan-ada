import java.util.Scanner;

public class Lista20 {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String Bairro;
     int Desconto,Renda,Consumo;  
     double Total;

    
     System.out.println("Informe o codigo do Bairro : ");
        Bairro = sc.nextLine();
        Bairro.charAt(0);
     
     System.out.println("Informe a Renda Familiar: ");
        Renda = sc.nextInt();;
     
     System.out.println("Informe o Consumo em reais : ");
        Consumo = sc.nextInt();


        sc.close();
     if ((Renda < 0) || (Consumo < 0)) {
        System.out.println("Renda e Consumo não podem ser Negativos");
                
    }else{        
             switch (Bairro) {
                case "s":
                    if ((Renda >= 50) && (Renda < 500)) {
                    Desconto = 50;
                
                    }else if ((Renda >= 500) && (Renda <= 1000)) {
                    Desconto = 25;
                    }else{
                    Desconto = 0;
                    }  Total = Consumo - Desconto; 
                    System.out.println("O total a pagar é : "+Total);                       
                    break;
        
                case "i":
                    if ((Renda >= 240) && (Renda < 1000)) {
                        Desconto = 240;
                
                    }else if ((Renda >= 1000) && (Renda <= 5000)) {
                        Desconto = 120;
                    }else{
                        Desconto = 0;
                    }  Total = Consumo - Desconto; 
                 System.out.println("O total a pagar é : "+Total);
                    break;

                case "t":
                    if ((Renda >= 1000) && (Renda < 5000)) {
                        Desconto = 720;
                
                    }else if ((Renda >= 10000) && (Renda <= 20000)) {
                        Desconto = 360;
                    }else{
                        Desconto = 0;
                    }  Total = Consumo - Desconto; 
                 System.out.println("O total a pagar é : "+Total);

                    break;

                default:
                System.out.println("Bairro digitado é invalido ");

                break;

        }

      }
    }

}     