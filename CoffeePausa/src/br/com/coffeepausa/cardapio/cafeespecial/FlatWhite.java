package br.com.coffeepausa.cardapio.cafeespecial;

import br.com.coffeepausa.cardapio.Cafe;

public class FlatWhite extends Cafe{

    public FlatWhite() {
        super("Flat White", 6.89);
    }

    @Override
    public void Preparo(){
        System.out.println("Pedido de um 'Flat White' recebido, ótima escolha!. Aguarde o preparo");
    }
}
