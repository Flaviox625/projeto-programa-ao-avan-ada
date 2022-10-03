import java.util.Scanner;

public class Lista12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Filo, Classe, Alimentacao;

        System.out.println("Escreva se o ser em questão é Vertebrado ou Invertebrado: ");
        Filo = sc.nextLine();

        if (Filo.equalsIgnoreCase("vertebrado")) {
            System.out.println("Escolha se o animal é Ave ou Mamifero: ");
            Classe = sc.nextLine();
            
        }else{
            System.out.println("Escolha se o animal é Inseto ou Anelideo: ");
            Classe = sc.nextLine();
        }
        if (Classe.equalsIgnoreCase("Ave")) {
            System.out.println("É Carnivoro ou Onivoro");
            Alimentacao = sc.nextLine();

            if (Alimentacao.equalsIgnoreCase("Carnivoro")) {
                System.out.println("Águia");
                
            }else {
                System.out.println("Pomba");
            }

            
        }if (Classe.equalsIgnoreCase("Mamifero")) {
            System.out.println("É Herbivoro ou Onivoro");
            Alimentacao = sc.nextLine();

            if (Alimentacao.equalsIgnoreCase("Onivoro")) {
                System.out.println("Homem");
            }else {
                System.out.println("Vaca");
            }


        }else if (Classe.equalsIgnoreCase("Inseto")) {
            System.out.println("É Hematofago ou Herbivoro");
            Alimentacao = sc.nextLine();

            if (Alimentacao.equalsIgnoreCase("Hematofago")) {
                System.out.println("Pulga");
            }else {
                System.out.println("Lagarta");
            }

            
        }else {
            System.out.println("É Hematofago ou Onivoro");
            Alimentacao = sc.nextLine();

            if (Alimentacao.equalsIgnoreCase("Onivoro")) {
                System.out.println("Minhoca");
            }else {
                System.out.println("Sanguessuga");
            }

        }

        sc.close();
    }
}        