package academy.devdojo.javaoneforall.introduction.conteudos;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        
        double salarioAnual = 70000;
        double valorImposto;

        if (salarioAnual < 34713) {
            valorImposto = salarioAnual * (9.70/100);
        } else if (salarioAnual > 34712 && salarioAnual < 69507) {
            valorImposto = salarioAnual * (37.35/100);
        }else {
            valorImposto = salarioAnual * (49.50/100);
        }
        System.out.println(valorImposto);
    }
}
