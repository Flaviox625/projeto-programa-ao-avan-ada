import java.util.Scanner;


public class Lista7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor:");
        int valor = sc.nextInt();
    
        if (valor<0) {
            System.out.println("DIgite um valor valido");
            valor = sc.nextInt(); 

        }if (valor>1000000) {
            System.out.println("Valor ultrapassa o limite digite outro valor");
            valor = sc.nextInt();
            
        }else{
        System.out.println("Notas de 100: " + valor / 100);
        System.out.println("Notas de 50 : " + (valor % 100) / 50);
        System.out.println("Notas de 20 : " + ((valor % 100) % 50) / 20);
        System.out.println("Notas de 10 : " + (((valor % 100) % 50) % 20) / 10);
        System.out.println("Notas de 5  : " + ((((valor % 100) % 50) % 20) % 10) / 5);
        System.out.println("Notas de 2  : " + (((((valor % 100) % 50) % 20) % 10) % 5) / 2);
        System.out.println("Notas de 1  : " + ((((((valor % 100) % 50) % 20) % 10) % 5) % 2) / 1);
        
        sc.close();
        }
}
}