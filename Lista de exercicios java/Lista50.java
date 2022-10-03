import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista50 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            {
                List<Integer> andares = new ArrayList<>();
                for(int i = 0; i < 1028; i++){
                    if(!String.valueOf(i).contains("4") && !String.valueOf(i).contains("13")){
                        andares.add(i);
                    }
                }
                do{
                   
                    System.out.println("Informe o numero desejado: ");
                    Integer numero = sc.nextInt();
                    System.out.println("Andar equivalente: " + andares.get(numero-1));
                }while (true);
                
                
            }
        }
    }
}