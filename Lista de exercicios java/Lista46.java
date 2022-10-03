import java.util.Scanner;

public class Lista46 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            long MFact = 1, NFact = 1;
            System.out.println("Informe o valor de M");
            long M = sc.nextInt();
            System.out.println("Informe o valor de n");
            long N = sc.nextInt();

            long MAdd = 1, NAdd = 1;
            if (M > 1 && M <= 20) {
                for (int i = 1; i < M; i++) {
                    MAdd = MAdd * i;
                }
                NFact = NAdd * M;
            } else if (M == 0 || M == 1) {
                MFact = 1;
            }
            if (N > 1 && N <= 20) {
                for (int j = 1; j < N; j++) {
                    NAdd = NAdd * j;
                }
                NFact = NAdd * N;
            } else if (N == 0 || N == 1) {
                NFact = 1;
            }
            System.out.println(MFact + NFact);
        }sc.close();
    }
}