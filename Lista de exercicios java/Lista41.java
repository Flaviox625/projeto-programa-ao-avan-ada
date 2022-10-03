import java.util.Scanner;

public class Lista41 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double Altura,Peso;

        System.out.println("Informe a Altura");
        Altura = sc.nextDouble();
        System.out.println("Informe o Peso");
        Peso = sc.nextDouble();

        sc.close();

        if (Altura <= 1.50) {

            if (Peso == 50) {
                System.out.println("Parabéns Peso Ideal");
            }else if (Peso > 50) {
                System.out.println("Emagreça "+(Peso - 50)+" Kg");
            }else{
                System.out.println("Engorde "+(50 - Peso)+" Kg");
            }
            
        } else if (Altura >= 1.91 ) {

            if (Peso == 100) {
                System.out.println("Parabéns Peso Ideal");
            }else if (Peso > 100) {
                System.out.println("Emagreça "+(Peso - 100)+" Kg");
            }else{
                System.out.println("Engorde "+(100 - Peso)+" Kg");
            }
        }else{

            if (Peso == 70) {
                System.out.println("Parabéns Peso Ideal");
            }else if (Peso > 70) {
                System.out.println("Emagreça "+(Peso - 70)+" Kg");
            }else{
                System.out.println("Engorde "+(70 - Peso)+" Kg");
            }

        }            
        
    }
}
