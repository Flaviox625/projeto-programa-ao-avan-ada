import java.util.Scanner;

public class Lista23 {
    public static int boolToInt(Boolean b) {
        return b ? 1 : 0;
    }
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int X,Y;
        boolean comparacao = false;
        int number = boolToInt(comparacao);
        

        System.out.println("Escreva o Valor de X e Y respectivamente");
        X = sc.nextInt();
        Y = sc.nextInt();
        System.out.println("");
        System.out.println("");
        sc.close();
        
        System.out.println("A Resposta É : ");
        if (X > Y) {          
            System.out.println(boolToInt(true));
                       
        }else{
            System.out.println(number);
        }
        if (X == Y) {
            System.out.println(boolToInt(true));
        }else{
            System.out.println(number);
        }
        if (X < Y) {
            System.out.println(boolToInt(true));
        }else{
            System.out.println(number);
        }
        if (X != Y) {
            System.out.println(boolToInt(true));
        }else{
            System.out.println(number);
        }
        if (X >= Y) {
            System.out.println(boolToInt(true));
        }else{
            System.out.println(number);
        }
        if (X <= Y) {
            System.out.println(boolToInt(true));
        }else{
            System.out.println(number);
        }
    }
}    