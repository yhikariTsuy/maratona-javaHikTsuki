package academy.devdojo.javaoneforall.javacore.npolymorphism.test;

import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Product;
import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 5", 3000);
        System.out.println(product.getNome() + "\n" + product.getValor() + "\n" + product.calcularImposto());
        System.out.println("=================================");
        Product product2 = new Tomato("Americano", 3.90);
        System.out.println(product2.getNome() + "\n" + product2.getValor() + "\n" + product2.calcularImposto());
    }
}
