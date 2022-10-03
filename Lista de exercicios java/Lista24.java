import java.util.Scanner;

public class Lista24 {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String Numero = "";
     String Numero_invertido = "";

     System.out.println("Digite o Numero de 5 Digitos A Ser Testado Se é Um Palndromo : ");
     Numero =  sc.nextLine();

     sc.close();   
 
     for (int i = 0; i < Numero.length(); i++) {
         Numero_invertido = Numero.charAt(i) + Numero_invertido;
     }
     System.out.println(Numero + " x " + Numero_invertido + " : Numero "
             + ((Numero.equals(Numero_invertido)) ? "É Sim Um Palindromo" : "Não É Um Palindromo "));

     
    }
}   