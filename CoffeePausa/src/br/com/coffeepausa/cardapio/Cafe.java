package br.com.coffeepausa.cardapio;

public abstract class Cafe {
    private String tipo;
    private Double preco;

    public Cafe(String tipo, Double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getCategoria() {
        return tipo;
    }

    public Double getPreco() {
        return preco;
    }

    public abstract void Preparo();
}
