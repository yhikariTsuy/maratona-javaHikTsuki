package academy.devdojo.javaoneforall.javacore.npolymorphism.domain;

public class Tomato extends Product {
    String dataDeValidade;
    public static final double IMPOSTO_POR_CENTO = 0.06;
    public Tomato(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto de Tomate...");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
