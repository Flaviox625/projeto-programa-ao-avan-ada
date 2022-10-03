import java.util.Scanner;

public class Lista10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int AA, MM, DD, Dias, Resto;

        System.out.println("Digite o valor em em dias ");
        Dias = sc.nextInt();
        sc.close();
        AA = Dias / 365;
        Resto = Dias % 365;

        MM = Resto / 30;

        DD = Resto % 30;

        System.out.println(AA+" Ano (s)\n"+MM+" Mês (es)\n"+DD+" Dia (s)");
        
    }    
}