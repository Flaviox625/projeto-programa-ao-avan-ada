import java.util.Scanner;

public class Lista42 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double A,B;

        System.out.println("Iforme A :");
        A = sc.nextDouble();
        System.out.println("Informe B :");
        B = sc.nextDouble();

        sc.close();

        double aumento = (B * 100.0 / A) - 100.0;
    	System.out.println(String.format("%.1f%%", aumento));

    }
}
