package academy.devdojo.javaoneforall.javacore.kenum.domain;

public enum TypeClient {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int VALOR;
    private String nomeRelatorio;

    TypeClient(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TypeClient TipoClientePorNome(String nomeRelatorio) {
        for (TypeClient typeClient : values()) {
            if (typeClient.getNomeRelatorio().equals(nomeRelatorio)) {
                return typeClient;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getValor() {
        return VALOR;
    }
}
