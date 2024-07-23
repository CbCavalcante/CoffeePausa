package br.com.coffeepausa.cardapio.expresso;

import br.com.coffeepausa.cardapio.Cafe;

public class Americano extends Cafe{

    public Americano() {
        super("Americano", 3.65);
    }

    @Override //Serve para sobreescrever um método.
    public void Preparo(){
        System.out.println("Pedido de um 'Americano' recebido, ótima escolha!. Aguarde o preparo");
    }
}
