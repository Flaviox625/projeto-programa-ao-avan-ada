import java.util.Scanner;

public class Lista26 {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        float A;
        int I;

        System.out.println("Informe a altura : ");
        A = sc.nextFloat();
        System.out.println("Informe a idade : ");
        I = sc.nextInt();

        sc.close();

        for(int cont=0 ; cont < 1 ; cont++){
            cont = 0;
                    
        if ((A >= 1.4) && (I >= 14)) {
            cont = cont+1;           
        }
        if ((A >= 1.5) && (I >= 12)) {
            cont = cont+1;
        }
        if ((A >= 1.7) || (I >= 16)) {
            cont = cont+1;      
        }
        System.out.println("");
        System.out.println(cont);

        }      
    }
}   