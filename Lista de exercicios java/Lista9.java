import java.util.Scanner;

public class Lista9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int HH, MM, SS, Segundos, Resto;

        System.out.println("Digite o valor em segundos ");
        Segundos = sc.nextInt();
        sc.close();
        HH = Segundos / 3600;
        Resto = Segundos % 3600;

        MM = Resto / 60;

        SS = Resto % 60;

        System.out.println("Horas , Minutos e Segundos : "+HH+":"+MM+":"+SS);
        
    }    
}
