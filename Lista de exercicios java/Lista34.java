import java.util.Scanner;

public class Lista34 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X,Y;

        System.out.println("Escreva respectivamente os valores de X e Y : ");
        X = sc.nextInt();Y = sc.nextInt();
        
        sc.close();

        if ((1 < X)&&(X < 20)&&(X < Y)&&(Y < 100000)) {

            for (int i = 1; i <= Y; i++) {
			System.out.print(i);
			if (i % X == 0) System.out.println("");
			else System.out.print(" ");

           }
        }else{
            System.out.println("Impossivel realizar tarefa");
        }

    }
}
