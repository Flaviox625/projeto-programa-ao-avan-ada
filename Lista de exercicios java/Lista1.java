import java.util.Scanner;

public class Lista1{


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Double A, B, Media;
    
    System.out.println("Qual a Nota A? ");
    A = sc.nextDouble()*3.5;

    System.out.println("Qual a Nota B? ");
    B = sc.nextDouble()*7.5;

    sc.close();

    Media = ((A+B))/11;

    if (Media>10) {System.out.println("impossivel mizeravi -_- ");
        
    }else{
    System.out.format("A media do aluno é : "+ "%.4f",Media);
    }
}

}




