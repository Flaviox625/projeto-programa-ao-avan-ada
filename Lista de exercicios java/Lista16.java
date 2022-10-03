import java.util.Scanner;

public class Lista16 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     Double Popa,Popb;
     int Anos = 0;

     System.out.println("Diga a população de A : ");
     Popa = sc.nextDouble();

     System.out.println("Diga a população de B");
     Popb = sc.nextDouble();

     sc.close();
     
     while (Popa < Popb) {
        Popa += ((Popa * 3.0) / 100.0);
        Popb += ((Popb * 1.5) / 100.0);
        Anos++;
        
     }
     System.out.println("Total de anos: "+ Anos);

    }
}    