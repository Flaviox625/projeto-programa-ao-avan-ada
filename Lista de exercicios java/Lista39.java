import java.util.Scanner;

public class Lista39 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.println("Digite o valor que quer saber a tabuada ");
        N =sc.nextInt();

        sc.close();

         for(int i = 1; i <= 10; i++){
         
         System.out.println(i + " x " +N+ " = "+(N*i));
         
        }  

    }
}
