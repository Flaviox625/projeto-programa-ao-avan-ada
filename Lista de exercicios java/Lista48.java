import java.util.Scanner;

public class Lista48 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float Gotas=0;
        int Idade;
        float Peso=0,Soma=0;

         System.out.println("Digite a idade: ");
         Idade = sc.nextInt();
         System.out.println("Digite o peso: ");
         Peso = sc.nextFloat();
         
         sc.close();
         
        if(Idade < 12 && Peso >= 5 && Peso <= 9) {
            Soma=125;
            Gotas = Soma / 25;
            System.out.println(Gotas+" Gotas");
        }
        if(Idade < 12 && Peso >= 9.1 && Peso <= 16) {
            Soma = 250;
            Gotas = Soma / 25;
            System.out.println(Gotas+" Gotas");
        }
        if(Idade < 12 && Peso >= 16.1 && Peso <= 24) {
            Soma = 375;
            Gotas = Soma / 25;
            System.out.println(Gotas+" Gotas");
        }
        if(Idade < 12 && Peso >= 24.1 && Peso <= 30) {
            Soma = 500;
            Gotas = Soma / 25;
            System.out.println(Gotas+" Gotas");
        }
        if(Idade < 12 && Peso > 30) {
            Soma = 750;
            Gotas = Soma / 25;
            System.out.println(Gotas+" Gotas");
        }
        if(Idade >= 12 && Peso >= 60) {
            Soma = 1000;
            Gotas =Soma / 25;
            System.out.println(Gotas+" Gotas");
        }
        if(Idade >= 12 && Peso <= 60) {
            Soma = 875;
            Gotas = Soma / 25;
            System.out.println(Gotas+" Gotas");
        }
        else {
            System.out.println(" algo de errado aconteceu.");
        }
    }

}
