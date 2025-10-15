package academy.devdojo.javaoneforall.javacore.npolymorphism.domain;

public class Computer extends Product {
    public static final double IMPOSTO_POR_CENTO = 0.20;

    public Computer(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto de Computador...");
        return  this.valor * IMPOSTO_POR_CENTO;
    }
}
