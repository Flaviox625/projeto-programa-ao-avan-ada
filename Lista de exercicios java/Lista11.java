import java.util.Scanner;

public class Lista11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Hi,Hf;

     System.out.println("Entre apenas com valores de 0 Até 24 para previnir erros de compreensão ");
     System.out.println("");
     System.out.println("");

        
        System.out.println("Digite a hora de inicio da partida ");
        Hi = sc.nextInt();

        System.out.println("Digite a hora do final da partida ");
        Hf = sc.nextInt();

        sc.close();

        if (Hi > Hf) {
            System.out.println("O Jogo Durou " + (24 - (Hi-Hf)) +" Hora (s)");
            
        }else if (Hf > Hi) {
            System.out.println("O Jogo Durou " + (Hf - Hi) +" Hora (s)");
            
        }else {
            System.out.println("O Jogo Durou 24 Horas ");
        }
    }
}