package academy.devdojo.maratonajava.introducao;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        int seq1 = 0;
        int seq2 = 1;
        int aux;

        System.out.println("Sequencia de Fibonacci:");
        for (int i = 0; i<20 ; i++) {
            System.out.print(seq1 + " ");
            aux = seq1;
            seq1 += seq2;
            seq2 = aux;
        }
    }
}
