package academy.devdojo.javaoneforall.javacore.hinheritance.test;

import academy.devdojo.javaoneforall.javacore.hinheritance.domain.Endereco;
import academy.devdojo.javaoneforall.javacore.hinheritance.domain.Funcionario;
import academy.devdojo.javaoneforall.javacore.hinheritance.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 4");
        endereco.setCep("012345-505");

        Pessoa pessoa = new Pessoa("Shinji Ikari");
        pessoa.setEndereco(endereco);
        pessoa.setCpf("123.456.789-01");

        pessoa.print();
        Funcionario funcionario = new Funcionario("Misato Katsuragi");
        funcionario.setCpf("012.234.232-10");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(4000);

        System.out.println("================");
        funcionario.print();
        funcionario.relatorioPagamento();


    }
}
