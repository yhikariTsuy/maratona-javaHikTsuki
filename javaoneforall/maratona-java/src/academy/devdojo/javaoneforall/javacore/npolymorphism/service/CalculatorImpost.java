package academy.devdojo.javaoneforall.javacore.npolymorphism.service;

import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Product;
import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Tomato;

public class CalculatorImpost {
    public static void calcularImposto(Product product) {
        System.out.println("Relatorio de Imposto do Produto: ");
        double imposto = product.calcularImposto();
        System.out.println("Produto: " + product.getNome());
        System.out.println("Valor: " + product.getValor());
        System.out.println("Imposto: " + imposto);
        if (product instanceof Tomato) {
            System.out.println(((Tomato) product).getDataDeValidade());
        }
    }

}


