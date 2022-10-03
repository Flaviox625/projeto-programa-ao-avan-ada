import java.util.Scanner;

public class Lista31 {

    public static void main(String[] args) {
	 Scanner sc =new Scanner(System.in);
	 double Nota1,media = 0,total = 0,Nota2 = 0;

		while (Nota2 != 2) {
            System.out.println("Diga a nota :");
			Nota1 =sc.nextFloat();
			if (Nota1 >=0.0 && Nota1 <= 10.0) {
				total += Nota1;
				Nota2 += 1;
			}else {
				System.out.print("nota invalida\n");
			}
		}
		sc.close();

		media = total / 2;
		
		System.out.printf("media = %.2f\n",media);
		
		}
    
}
