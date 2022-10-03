import java.util.Scanner;

public class Lista6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Distancia;
        double CombusGasto, Km_Litro;

        System.out.println("Qual a distancia pecorrida em KM? ");
        Distancia = sc.nextInt();

        System.out.println("Qual a quantidade de combustivel gasto durante o perceurso?");
        CombusGasto = sc.nextDouble();

        sc.close();

        Km_Litro = Distancia/CombusGasto;

        System.out.format("O carro faz em media  "+Km_Litro+" Km/L");



    }    
}
