import java.util.Scanner;

public class Lista19 {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
  
     double Salario ,Aumento ,Total;

     System.out.println("Qual o salario do funcionario ? ");
     Salario = sc.nextDouble();
     
     sc.close();

     if (Salario >= 500) {
        Aumento = Salario * 0.1;
        Total = Aumento + Salario;
        System.out.println("O salario com o Aumento ficou : "+Total);        
    }else if ((Salario >=300) && (Salario <= 499)) {
        Aumento = Salario * 0.07;
        Total = Aumento + Salario;
        System.out.println("O salario com o Aumento ficou : "+Total);      
    }else {
        Aumento = Salario * 0.05;
        Total = Aumento + Salario;
        System.out.println("O salario com o Aumento ficou : "+Total);
    }
    }
}    