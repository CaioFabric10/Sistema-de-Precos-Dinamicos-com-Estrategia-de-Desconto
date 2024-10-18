package entidades;

public class Produto {
    private String nomeProduto;
    private Double precoBase;

    public Produto(String nomeProduto, Double precoBase) {
        this.nomeProduto = nomeProduto;
        this.precoBase = precoBase;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Double getPrecoBase() {
        return precoBase;
    }
}
