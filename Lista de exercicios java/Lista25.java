import java.util.Scanner;

public class Lista25 {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int Inter_Graf,Int_Art,Encaps,Indent,Structs;

        System.out.println(" 0 - Se o trabalho não possui tal quesito  1 - Se trabalho possui tal quesito");

        System.out.println("");

        System.out.println("Possui interface grafica ? ");
        Inter_Graf = sc.nextInt();

        System.out.println("Possui Inteligencia artificial ? ");
        Int_Art = sc.nextInt();

        System.out.println("possui Encapsulamento ? ");
        Encaps = sc.nextInt();

        System.out.println("Possui Indentação ? ");
        Indent = sc.nextInt();

        System.out.println("Possui Uso de Structs ? ");
        Structs = sc.nextInt();

        sc.close();

        if ((Inter_Graf == 1) || (Int_Art == 1)) {
            if ((Encaps == 1) && (Indent == 1)) {
                if (Structs == 1) {
                    System.out.println("AVALIADO");                    
                }else{
                    System.out.println(" 0 (ZERO)");
                }
            
            }else{
                System.out.println(" 0 (ZERO)");
            }
        }else{
            System.out.println(" 0 (ZERO)");
        }
    }
}   