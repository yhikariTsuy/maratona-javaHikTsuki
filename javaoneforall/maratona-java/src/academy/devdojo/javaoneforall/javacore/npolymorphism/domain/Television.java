package academy.devdojo.javaoneforall.javacore.npolymorphism.domain;

public class Television extends Product {
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Television(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto de Televisão...");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
