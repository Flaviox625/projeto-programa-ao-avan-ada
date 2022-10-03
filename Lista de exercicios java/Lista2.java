import java.util.Scanner;

public class Lista2{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

 System.out.println("Numero do funcionario");
 int NumeroDeFuncionario = sc.nextInt();

 System.out.println("Quantas horas trabalhadas? ");
 int HorasTrabalhadas = sc.nextInt();

 System.out.println("Qual o valos da hora trabalhada?");
 double ValorHora = sc.nextDouble();

 sc.close();
  
   Double Salario = HorasTrabalhadas*ValorHora;

   System.out.println("funcionario fulano de tal com o Numero " + NumeroDeFuncionario + " Recebeu um salario de :"+Salario );
}
}