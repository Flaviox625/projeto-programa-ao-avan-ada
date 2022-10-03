import java.util.Scanner;

public class Lista30 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int X,Y;
        
     for (int i = 0; i <= 4; i++) {
        System.out.println("Informe o valor X e Y");
        X=sc.nextInt(); Y=sc.nextInt();
        i++;
     
        int soma = 0;
        if (X > Y) {
            for (Y = Y; Y <= X; Y++) {
                soma+=Y;
                System.out.print(Y+" ");
            }
            System.out.print("Soma = "+soma+"\n");
        }else {
            for (X = X; X <= Y; X++) {
                soma+=X;
                System.out.print(X+" ");
            }
            System.out.print("Soma = "+soma+"\n");
        }
    
    }
    sc.close();
}

}