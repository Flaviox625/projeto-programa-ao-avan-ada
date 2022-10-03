import java.util.Scanner;

public class Lista4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2 , num3 , maior, menor ;
        
        System.out.println("Digite o primeiro numero:");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo numero:");
        num2 = sc.nextInt();

        System.out.println("Digite o terceiro numero:");
        num3 = sc.nextInt();

        sc.close();
        maior = num1;
        menor = num1;

        if (num2>maior) {
            maior=num2;
        }
        if(num3>maior) {
            maior=num3;
        }
        if (menor>num2) {
            menor=num2;
        }
        if (num3<menor) {
            menor=num3;
        }
        System.out.println("maior: "+ maior);
        System.out.println("menor: "+ menor);
            
        }
            
        }
