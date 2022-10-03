import java.util.Scanner;

public class Lista49 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso=0,altura=0,imc=0;
        String situacao="";

        for(int i = 0;i < 1; i++){
            System.out.println("Informe o peso : ");
            peso = sc.nextDouble();
            System.out.println("Informe a altura : ");
            altura = sc.nextDouble();

    

            imc = peso / (altura*altura);

            if (imc < 20) {
                situacao = "Abaixo do peso" ;
            }
            if (imc >= 20 && imc < 25) {
                situacao = "Peso Normal";
            }
            if (imc >= 25 && imc < 30) {
                situacao = "Sobrepeso";
            }
            if (imc >= 30 && imc <= 40 ) {
                situacao = "Obeso";
            }
            if (imc > 40) {
                situacao = "Obeso Mórbido";                
            }

        }sc.close(); 
        System.out.println("IMC = "+imc+" - "+situacao);
    }
}
