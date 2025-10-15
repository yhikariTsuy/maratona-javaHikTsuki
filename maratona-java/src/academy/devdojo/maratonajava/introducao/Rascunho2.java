package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Rascunho2 {
    public static void main(String[] args) {
        String resposta = "[";
        Scanner input = new Scanner(System.in);

        System.out.println("========CONTADOR-INTELIGENTE========");
        System.out.print  ("Digite o seu inicio: ");
        int n1 = input.nextInt();
        System.out.print  ("Digite o seu fim: ");
        int n2 = input.nextInt();
        System.out.print  ("Digite o seu passo: ");
        int n3 = input.nextInt();
        System.out.println("====================================");

        if (n1 <= n2) {
            for (int i = n1; i <= n2 ; i += n3) {
                resposta += i + (i < n2 ? ", " : "]");
            }
        }else {
            for (int i = n1; i >= n2 ; i += n3) {
                resposta += i + (i > n2 ? ", " : "]");
            }
        }
        System.out.println(resposta);
        System.out.println("====================================");

    }
}
