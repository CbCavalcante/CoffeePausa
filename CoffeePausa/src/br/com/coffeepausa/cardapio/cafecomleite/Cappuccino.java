package br.com.coffeepausa.cardapio.cafecomleite;

import br.com.coffeepausa.cardapio.Cafe;

public class Cappuccino extends Cafe{

    public Cappuccino() {
        super("Cappuccino", 5.75);
    }

    @Override
    public void Preparo(){
        System.out.println("Pedido de um 'Cappuccino' recebido, ótima escolha!. Aguarde o preparo");
    }
}
