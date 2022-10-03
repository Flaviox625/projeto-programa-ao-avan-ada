import java.util.Scanner;

public class Lista5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Digite um numero");
        a = sc.nextInt();
        System.out.println("Digite um numero");
        b = sc.nextInt();
        System.out.println("Digite um numero");
        c = sc.nextInt();

        System.out.println("");

        sc.close();

        if (a < b) {
            if (b < c){
                System.out.println(a+"\n"+b+"\n"+c);
            }
            else if (a < c) {
                System.out.println(a+"\n"+c+"\n"+b);                
            } else{
                System.out.println(c+"\n"+a+"\n"+b);  
            }   
            }
            else if (b < c) {
                if (a < c) {
                    System.out.println(b+"\n"+a+"\n"+c);                    
                } else{
                    System.out.println(b+"\n"+c+"\n"+a);
                }                
            }  else{
                System.out.println(c+"\n"+b+"\n"+a);
            }           
        }
        
    }

