package br.com.coffeepausa.cardapio.expresso;

import br.com.coffeepausa.cardapio.Cafe;

public class ExpressoDuplo extends Cafe{

    public ExpressoDuplo() {
        super("Expresso Duplo", 3.65);
    }

    @Override
    public void Preparo(){
        System.out.println("Pedido de um 'Expresso Duplo' recebido, ótima escolha!. Aguarde o preparo");
    }
}
