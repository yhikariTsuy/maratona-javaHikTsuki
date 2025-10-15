package academy.devdojo.javaoneforall.javacore.kenum.domain;

public class Client {

    private String nome;
    private TypeClient typeClient;
    private TypePayment typePayment;

    public Client(String nome, TypeClient typeClient, TypePayment typePayment) {
        this.nome = nome;
        this.typeClient = typeClient;
        this.typePayment = typePayment;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + typeClient.getNomeRelatorio() +
                ", tipoClienteInt=" + typeClient.VALOR +
                ", tipoPagamento=" + typePayment +
                '}';
    }
}
