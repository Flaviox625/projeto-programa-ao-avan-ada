import java.util.Scanner;

public class Lista3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o Nome do vendedor? ");
        String Nome = sc.nextLine();

        System.out.println("Qual salario fixo do vendedor? ");
        double Salario = sc.nextDouble();

        System.out.println("total de vendas ");
        double TotalDeVendas = sc.nextDouble();

        sc.close();

        double Comicao = TotalDeVendas * 0.15;
        double SalarioFinal = Salario + Comicao;
        
        System.out.printf("O funcionario " + Nome + " Recebeu um salario de : " + SalarioFinal , "%.2f"+ " Mais uma comição de : " + Comicao + " Totalizando um Valor final de :" + SalarioFinal +" REAIS" );



    }
}
